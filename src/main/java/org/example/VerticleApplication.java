package org.example;

import io.vertx.core.AbstractVerticle;
import io.vertx.core.Vertx;

import java.lang.reflect.InvocationTargetException;

// https://zhuanlan.zhihu.com/p/448153804
public class VerticleApplication {

    public static Vertx run(Class<? extends AbstractVerticle> primarySource, String... args) {

        // create vert.x service
        Vertx vertx = Vertx.vertx();

        try {
            AbstractVerticle source = primarySource.getConstructor()
                    .newInstance();

            // deploy
            // should be run http server start.
            vertx.deployVerticle(source);
        } catch (InstantiationException | IllegalAccessException | InvocationTargetException | NoSuchMethodException e) {
            throw new RuntimeException(e);
        } finally {
            vertx.deploymentIDs().forEach(vertx::undeploy);
        }

        return vertx;
    }
}
