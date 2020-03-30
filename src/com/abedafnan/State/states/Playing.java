package com.abedafnan.State.states;


import com.abedafnan.State.IMediaPlayer;

public class Playing extends AbstractState{

	public Playing(IMediaPlayer player) {
		super(player);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void playerDestroy() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void playerCreate() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void playerPrepared() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void playerUnprepared() {
		System.out.println("Stop playing");
		System.out.println("Release tracks of album from memory");
		player.setCurrentState(new Idle(player));
		System.out.println("Idle");
	}

	@Override
	public void playerStart() {
		
	}

	@Override
	public void playerStop() {
		System.out.println("stop playing current track");
		player.setCurrentState(new Ready(player));
		System.out.println("Ready");
	}

	@Override
	public void playerPaused() {
		System.out.println("store current track and time frame");
		player.setCurrentState(new Paused(player));
		System.out.println("Paused");
		
	}

	

}
