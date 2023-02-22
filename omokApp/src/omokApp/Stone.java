package omokApp;

public class Stone {
private Player player;
private StoneColor color;
public Stone(Player player,StoneColor color) {
	this.player=player;
	this.color=color;
}
public Player getPlayer() {
	return player;
}
public StoneColor getColor() {
	return color;
}
}
