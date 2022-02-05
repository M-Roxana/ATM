class Patrat extends Square {
  public Patrat(int pozX, int pozY, int latura, String culoare) {
       super();
       moveHorizontal(pozX - 20);
       moveVertical(pozY -20);
       changeSize(latura);
       changeColor(culoare);
       makeVisible();
    }
}
