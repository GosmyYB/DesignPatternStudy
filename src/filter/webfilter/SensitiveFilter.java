package filter.webfilter;

/**
 * Created by wyb.
 */
public class SensitiveFilter implements Filter {
    @Override
    public void doFilter(Request request, Response response, FilterChain chain) {
        request.requestMsg = request.requestMsg.replace("敏感", "").replace("被就业", "就业");
        request.requestMsg += "-----------SensitiveFilter";
        chain.doFilter(request, response, chain);
        response.responseMsg += "-----------SensitiveFilter";
    }
}
