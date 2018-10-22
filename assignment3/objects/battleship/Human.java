class Human extends player{
    public Human(){
        super();
    }
    public void placeShip(){
        super.placeShip();
    }
    public boolean launchTorpedo(Torpedo torpedo, Player adversary){
        return super.launchTorpedo(torpedo, adversary);
    }
}