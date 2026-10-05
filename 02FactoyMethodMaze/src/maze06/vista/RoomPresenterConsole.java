package maze06.vista;

import java.util.HashSet;
import java.util.Set;

import maze06.model.Polar;
import maze06.model.Room;
import maze06.model.products.Side;

public class RoomPresenterConsole implements RoomPresenter {

	@Override
	public void introduceSide(Polar polarEnum, Side side) {
		System.out.print("En el lado " + polarEnum);
		System.out.println(" hay una " + side.toString());
	}

	@Override
	public void introduceRoom(Room room) {
		System.out.println("presentando la habitacion ");
		System.out.println("entrada " + room.getEntranceDoor());
		Polar.getLeftPolarEnum(checkedRoomExitable(room)).stream().forEach((polar) -> {
			System.out.println("lado " + polar + " es " + room.getSide(polar));
		});
	}

	private Set<Polar> checkedRoomExitable(Room room) {
		Set<Polar> of = new HashSet<>();
		of.add(room.getEntranceDoor());
		if (room.isExitable()) {
			System.out.println("salida " + room.getExitDoor());
			of.add(room.getExitDoor().get());
			return of;
		}
		return of;
	}

}
