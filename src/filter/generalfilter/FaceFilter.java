package filter.generalfilter;

/**
 * Created by wyb.
 */
public class FaceFilter implements Filter {
    @Override
    public String doFilter(String str) {
        return str.replace(":)", "^V^");
    }
}
