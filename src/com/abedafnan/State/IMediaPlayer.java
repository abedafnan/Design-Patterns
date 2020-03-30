package com.abedafnan.State;

import com.abedafnan.State.states.IState;

public interface IMediaPlayer {

	public void destroy();
	public void loadAlbum();
	public void stop();
	public void play();
	public void pause();
	public void setCurrentState(IState state);
	
}
