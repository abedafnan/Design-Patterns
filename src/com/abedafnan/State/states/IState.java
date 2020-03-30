package com.abedafnan.State.states;

public interface IState {
	
	public void playerDestroy();
	public void playerCreate();
	public void playerPrepared();
	public void playerUnprepared();
	public void playerStart();
	public void playerStop();
	public void playerPaused();
	

}
