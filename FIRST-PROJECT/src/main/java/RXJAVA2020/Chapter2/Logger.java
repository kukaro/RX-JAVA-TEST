package RXJAVA2020.Chapter2;

import javax.annotation.Nonnull;

class Logger {
    private static Logger instance = new Logger();
    @Nonnull
    private static org.slf4j.Logger inner= org.slf4j.LoggerFactory.getLogger(P62_Single_just.class);

    public void info(Object o) {
        inner.info("" + o);
    }

    public static Logger getInstance() {
        return instance;
    }
}
