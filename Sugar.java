class Sugar extends Cookie {
  private
    String cookieShape;
    Boolean isDecorated;

  Sugar(){
    cookieShape = "";
    isDecorated = false;
  }

  String getShape() {
    return cookieShape;
  }

  Sugar(String aCookieShape) {
    cookieShape = aCookieShape;
  }

  void cutOut(String shape, int numCookies) {
    System.out.println(numCookies + " cookies were cut into " + cookieShape);
    setNumber(numCookies);
  }

  void readyToDecorate() {
    super.getReadiness();
    if (isReady == true) {
      isDecorated =  true;
      System.out.println("The cookies were decorated");
    } else {
      System.out.println("Make sure to bake the cookies first");
    }
  }
};