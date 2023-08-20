module jigsaw.db {
    requires transitive jigsaw.service;
    requires java.logging;
    requires jigsaw.model;
    exports main.java.dbModule;
}