package pl.edu.uj.kimage.api;

import java.util.List;

public class Step {
    private final int number;
    private final String pluginName;
    private final List<StepDependency> dependencies;

    public Step(int number, String pluginName, List<StepDependency> dependencies) {
        this.number = number;
        this.pluginName = pluginName;
        this.dependencies = dependencies;
    }

    public int getNumber() {
        return number;
    }

    public String getPluginName() {
        return pluginName;
    }

    public List<StepDependency> getDependencies() {
        return dependencies;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Step step = (Step) o;

        if (number != step.number) return false;
        if (pluginName != null ? !pluginName.equals(step.pluginName) : step.pluginName != null) return false;
        return dependencies != null ? dependencies.equals(step.dependencies) : step.dependencies == null;

    }

    @Override
    public int hashCode() {
        int result = number;
        result = 31 * result + (pluginName != null ? pluginName.hashCode() : 0);
        result = 31 * result + (dependencies != null ? dependencies.hashCode() : 0);
        return result;
    }
}