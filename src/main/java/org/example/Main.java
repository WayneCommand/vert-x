package org.example;


import io.vertx.core.AbstractVerticle;
import io.vertx.core.MultiMap;
import io.vertx.core.Vertx;
import io.vertx.core.http.HttpServer;
import io.vertx.core.http.HttpServerResponse;
import io.vertx.core.json.JsonObject;
import io.vertx.ext.web.Router;

public class Main extends AbstractVerticle {


    public static void main(String[] args) {
        // create vert.x service
        Main verticle = new Main();
        Vertx vertx = Vertx.vertx();

        // deploy
        // should be run http server start.
        vertx.deployVerticle(verticle);
    }

    // https://zhuanlan.zhihu.com/p/448153804
    @Override
    public void start() throws Exception {
        // Create a Router
        Router router = Router.router(vertx);

        // Mount the handler for all incoming requests at every path and HTTP method
        router.route().handler(context -> {
            // Get the address of the request
            String address = context.request().connection().remoteAddress().toString();
            // Get the query parameter "name"
            MultiMap queryParams = context.queryParams();
            String name = queryParams.contains("name") ? queryParams.get("name") : "unknown";
            // Write a json response
            context.json(
                    new JsonObject()
                            .put("name", name)
                            .put("address", address)
                            .put("message", "Hello " + name + " connected from " + address)
            );
        });

        // Create the HTTP server
        vertx.createHttpServer()
                // Handle every request using the router
                .requestHandler(router)
                // Start listening
                .listen(8888)
                // Print the port
                .onSuccess(server ->
                        System.out.println(
                                "HTTP server started on port " + server.actualPort()
                        )
                );

    }
}