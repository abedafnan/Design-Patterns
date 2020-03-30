package com.abedafnan.State.states;


import com.abedafnan.State.IMediaPlayer;

public class Ready extends AbstractState{

	public Ready(IMediaPlayer player) {
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
		System.out.println("release album tracks from memory");
		player.setCurrentState(new Idle(player));
		System.out.println("IDLE");
	}

	@Override
	public void playerStart() {
		System.out.println("Start playing the first track in album");
		player.setCurrentState(new Playing(player));
		System.out.println("PLAYING");

	}

	@Override
	public void playerStop() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void playerPaused() {
		// TODO Auto-generated method stub
		
	}

	

}
