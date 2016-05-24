package jpu2016.dogfight.model;

import java.util.ArrayList;
import jpu2016.dogfight.model;

public interface IDogfightModel {
	public IArea getArea();
	public void buildArea(Dimension);
	public void addMobile(IMobile);
	public void removeMobile(IMobile);
	public ArrayList<IMobile> getMobile();
}
