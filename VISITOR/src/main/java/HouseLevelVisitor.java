/*  Class Visitor has several overloaded methods of the same name,
    each of which will be called inside the accept method of each sub-object
    of the composite object
*/
public interface HouseLevelVisitor {
    void visit(FirstLevel firstLevel);

    void visit(SecondLevel secondLevel);

    void visit(ThirdLevel thirdLevel);

    void visit(House house);
}

class HouseLevelPrintVisitor implements HouseLevelVisitor {

    @Override
    public void visit(FirstLevel firstLevel) {
        System.out.println("Visit  " + firstLevel.getLevelName());
    }

    @Override
    public void visit(SecondLevel secondLevel) {
        System.out.println("Visit  " + secondLevel.getLevelName());
    }

    @Override
    public void visit(ThirdLevel thirdLevel) {
        System.out.println("Visit  " + thirdLevel.getLevelName());
    }

    @Override
    public void visit(House house) {
        System.out.println("Visit house");
    }
}

