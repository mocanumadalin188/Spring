package enums;

public enum Sports {

    FOOTBALL("Football", 11, true),
    TENNIS("Tennis", 1, false),
    HANDBALL("Handball", 6, true),
    BASKETBALL("Basketball", 6, false),
    SNOOKER("Snooker", 1, false);

    private final String name;
    private final int numberOfPlayers;
    private final boolean hasGoalkeeper;

    Sports(String name, int numberOfPlayers, boolean hasGoalkeeper) {
        this.name = name;
        this.numberOfPlayers = numberOfPlayers;
        this.hasGoalkeeper = hasGoalkeeper;
    }

    public String getName() {
        return name;
    }

    public int getNumberOfPlayers() {
        return numberOfPlayers;
    }

    public boolean isHasGoalkeeper() {
        return hasGoalkeeper;
    }

    private boolean hasGoalkeeper() {
        return this.hasGoalkeeper;
    }
}
