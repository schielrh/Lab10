class Cookie {
  private
    int numCookies;
    int bakeTemp;
    int bakeTime;
    Boolean isReady;

 Cookie() {
  numCookies = 0;
  bakeTemp = 0;
  bakeTime = 0;
  isReady = false;
 }

 Cookie(int numberOfCookies, int bakingTemp, int bakingTime) {
  numberOfCookies = numCookies;
  bakingTemp = bakeTemp;
  bakingTime = bakeTime;
  isReady = false;
 }

 Boolean getReadiness(){
   return isReady;
 }

  public void setNumber(int numCookies) {
   this.numCookies = numCookies;
  }

 void Bake(int bakeTemp, int bakeTime) {
   System.out.println(numCookies + " cookies were baked at " + bakeTemp + " degrees F for " + bakeTime + " minutes");
   isReady = true;
 }
};