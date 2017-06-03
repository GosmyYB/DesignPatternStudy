package filter.generalfilter;


/**
 * Created by wyb.
 */
public class HtmlFilter implements Filter {

    @Override
    public String doFilter(String str) {
        return str.replace('<', '[').replace('>', ']');
    }
}
