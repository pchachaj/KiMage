package pl.edu.uj.kimage.api;

public class StepDependency {
    private final int dependentStepNumber;
    private final String objectType;

    public StepDependency(int dependentStepNumber, String objectType) {
        this.dependentStepNumber = dependentStepNumber;
        this.objectType = objectType;
    }

    public int getDependentStepNumber() {
        return dependentStepNumber;
    }

    public String getObjectType() {
        return objectType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        StepDependency that = (StepDependency) o;

        if (dependentStepNumber != that.dependentStepNumber) return false;
        return objectType != null ? objectType.equals(that.objectType) : that.objectType == null;

    }

    @Override
    public int hashCode() {
        int result = dependentStepNumber;
        result = 31 * result + (objectType != null ? objectType.hashCode() : 0);
        return result;
    }
}