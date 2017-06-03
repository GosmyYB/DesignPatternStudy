package filter.webfilter;

/**
 * Created by wyb.
 */
public class HtmlFilter implements Filter {
    @Override
    public void doFilter(Request request, Response response, FilterChain chain) {
        request.requestMsg = request.requestMsg.replace("<", "[").replace(">", "]");
        request.requestMsg += "-------HtmlFilter";
        chain.doFilter(request, response, chain);
        response.responseMsg += "-------HtmlFilter";
    }
}
