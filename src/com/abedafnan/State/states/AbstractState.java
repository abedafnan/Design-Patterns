package com.abedafnan.State.states;

import com.abedafnan.State.IMediaPlayer;

public abstract class AbstractState implements IState{

	IMediaPlayer player;
	
	public AbstractState(IMediaPlayer player) {
		this.player = player;
	}

}
