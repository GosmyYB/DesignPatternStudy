package filter.webfilter;

/**
 * Created by wyb.
 */
public interface Filter {
    void doFilter(Request request, Response response, FilterChain chain);
}
