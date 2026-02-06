class Example {

    // final variable
    final int MAX_LIMIT = 100;

    // final method
    final void show() {
        System.out.println("Final method cannot be overridden");
    }

    void demonstrateFinally() {

        try {
            int x = 10 / 2;
            System.out.println("Result: " + x);
        } catch (Exception e) {
            System.out.println("Exception occurred");
        } finally {
            System.out.println("Finally block always executes");
        }
    }

    // finalize method (not recommended in real projects)
    @Override
    protected void finalize() throws Throwable {
        System.out.println("Finalize method called");
    }
}
