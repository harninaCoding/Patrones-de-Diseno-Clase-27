package maze06.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Optional;

import maze06.model.creators.DoorCreator;
import maze06.model.creators.ProductManager;
import maze06.model.products.Side;
import maze06.vista.RoomPresenter;

public class Room {
	private final int size = 4;
	private HashMap<Polar, Side> sides = new HashMap<>(size);
	private RoomPresenter roomPresenter;
	private Polar exitDoor;
	private Polar entranceDoor;
	private ArrayList<Polar> assignedPolars=new ArrayList<>();
	private boolean exitable=true;
	
	public Room(Polar entranceDoor,RoomPresenter roomPresenter,boolean exitable) {
		super();
		this.entranceDoor=entranceDoor;
		exitDoor=assignSide(entranceDoor, ProductManager.getProduct(new DoorCreator()));
		Polar sideOne=assignSide(exitDoor, exitable?ProductManager.getProduct(new DoorCreator()): ProductManager.getRandomProductNoDoor());
		Polar sideTwo=assignSide(sideOne, ProductManager.getRandomProductNoDoor());
		assignSide(sideTwo, ProductManager.getRandomProductNoDoor());
		this.roomPresenter=roomPresenter;
		this.exitable=exitable;
	}

	private Polar assignSide(Polar polar, Side side) {
		assignedPolars.add(polar);
		sides.put(polar, side);
		//indica como debe ser la conversion del List de olar en []
		return Polar.getRandomPolar(assignedPolars.toArray(new Polar[0]));
	}
	
	public void explore() {
		roomPresenter.introduceRoom(this);
	}
	public Optional<Polar> getExitDoor() {
		return exitable?Optional.of(exitDoor):Optional.ofNullable(null);
	}
	public Polar getEntranceDoor() {
		return entranceDoor;
	}

	public Side getSide(Polar polar) {
		return sides.get(polar);
	}

	public boolean isExitable() {
		return exitable;
	}

	
}
