import java.util.List;

public interface Level {
    void accept(HouseLevelVisitor houseLevelVisitor);
}

class FirstLevel implements Level {
    @Override
    public void accept(HouseLevelVisitor houseLevelVisitor) {
        houseLevelVisitor.visit(this);
    }

    public String getLevelName() {
        return "First Level";
    }
}

class SecondLevel implements Level {
    @Override
    public void accept(HouseLevelVisitor houseLevelVisitor) {
        houseLevelVisitor.visit(this);
    }

    public String getLevelName() {
        return "Second Level";
    }
}

class ThirdLevel implements Level {
    @Override
    public void accept(HouseLevelVisitor houseLevelVisitor) {
        houseLevelVisitor.visit(this);
    }

    public String getLevelName() {
        return "Third Level";
    }
}

class House implements Level {
    List<Level> houseLevelList;

    public House() {
        houseLevelList = List.of(new FirstLevel(), new SecondLevel(), new ThirdLevel());
    }

    @Override
    public void accept(HouseLevelVisitor houseLevelVisitor) {
        for (Level level : houseLevelList) {
            level.accept(houseLevelVisitor);
        }
        houseLevelVisitor.visit(this);
    }
}
