package org.example;

import io.vertx.core.Vertx;

public class Bootstrap {
    public static void main(String[] args) {


        // 1. 创建 vertx 实例
        Vertx vertx = Vertx.vertx();

        // 2. 创建应用实例
        MainVerticle mainVerticle = new MainVerticle();

        // 3. 部署
        vertx.deployVerticle(mainVerticle);
    }

}
