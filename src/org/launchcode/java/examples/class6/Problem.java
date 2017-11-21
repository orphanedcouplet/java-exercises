package org.launchcode.java.examples.class6;

public class Problem {
    private final String code;

    public String getCode() {
        return code;
    }

    public Problem(String code) {
        this.code = code;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Problem problem = (Problem) o;

        // note: the next line of code is a ternary(?)
        // format:
        // return <condition statement> ? <what to do if true> : <what to do if false>
        return code != null ? code.equals(problem.code) : problem.code == null;
    }

    @Override
    public int hashCode() {
        return code != null ? code.hashCode() : 0;
    }

    @Override
    public String toString() {
//        for (Problem problemOld)
        return "Problem{" +
                "code='" + code + '\'' +
                " hashCode=" + hashCode() +
                '}';
    }
}
