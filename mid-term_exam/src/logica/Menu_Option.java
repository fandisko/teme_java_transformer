package logica;

public abstract class Menu_Option {
    private String option;
    private String description;

    public Menu_Option(String option, String description) {
        this.option = option;
        this.description = description;
    }

    public String getOption() {
        return option;
    }

    public void setOption(String option) {
        this.option = option;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return this.option+" - "+this.description;
    }

    public abstract void menuAction();
}