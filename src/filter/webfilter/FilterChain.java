package filter.webfilter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wyb.
 */
public class FilterChain implements Filter {
    private List<Filter> filters = new ArrayList<>();
    // 记录当前执行到哪个 Filter
    private int index = 0;

    public FilterChain addFilter(Filter f) {
        filters.add(f);
        return this;
    }

    @Override
    public void doFilter(Request request, Response response, FilterChain chain) {
        if (index == filters.size()) {
            return;
        }
        Filter f = filters.get(index);
        index++;
        f.doFilter(request, response, chain);
    }
}
