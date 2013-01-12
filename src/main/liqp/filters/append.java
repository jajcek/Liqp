package liqp.filters;

class append extends Filter {

    /*
     * (Object) append(input, string)
     *
     * add one string to another
     */
    @Override
    public Object apply(Object value, Object... params) {

        return super.asString(value) + super.asString(super.get(0, params));
    }
}