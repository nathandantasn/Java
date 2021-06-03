
public class RoboSimples {

	private char direction = 'N';

	public void setNewDirection(char newDirection) {
		if (newDirection != 'N' && newDirection != 'L' && newDirection != 'O' && newDirection != 'S') {
			this.direction = 'N';
		}
		else {
			this.direction = newDirection;
		}
	}
	
	public char getNewDirection() {
		return direction;
	}

}