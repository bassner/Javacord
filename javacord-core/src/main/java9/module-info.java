@SuppressWarnings("requires-transitive-automatic")
module org.javacord.core {
    requires okhttp3.logging;

    requires transitive org.javacord.api;
    requires transitive okhttp3;
    requires transitive nv.websocket.client;
    requires transitive org.apache.logging.log4j;

    requires transitive java.desktop;

    exports org.javacord.core.util to org.javacord.api;

    provides org.javacord.api.util.internal.DelegateFactoryDelegate
        with org.javacord.core.util.DelegateFactoryDelegateImpl;
}
