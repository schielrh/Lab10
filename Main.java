class Main {
  public static void main(String [] args) {
    Sugar tree = new Sugar("tree");

    tree.cutOut(tree.getShape(),10);

    tree.Bake(350,12);

    tree.readyToDecorate();

    Sugar aCookie = new Sugar();

    aCookie.readyToDecorate();
  }
}