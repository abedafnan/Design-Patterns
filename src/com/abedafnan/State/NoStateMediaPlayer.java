package com.abedafnan.State;

import com.abedafnan.State.states.IState;

public class NoStateMediaPlayer implements IMediaPlayer{

	public static final int IDLE = 1;
	public static final int READY = 2;
	public static final int PLAYING = 3;
	public static final int PAUSED = 4;
	
	int currentState;
	
	public NoStateMediaPlayer() {
		System.out.println("Creating media player");
		currentState = IDLE;
		System.out.println("IDLE");
	}

	@Override
	public void destroy() {
		if(currentState == PLAYING || currentState == PAUSED){
			System.out.println("stop playing current track");
			System.out.println("release album");
			System.out.println("Destroy player");

		}else if(currentState == READY){
			System.out.println("release album");
			System.out.println("Destroy player");

		}else if(currentState == IDLE){
			System.out.println("Destroy player");
			
		}
	}

	@Override
	public void loadAlbum() {
		if(currentState == IDLE){
			System.out.println("Load all tracks in the a;bum in memory");
			currentState = READY;
			System.out.println("READY");
		}
	}

	@Override
	public void stop() {
		if(currentState == PAUSED || currentState == PLAYING){
			System.out.println("stop playing current track");
			currentState = READY;
			System.out.println("READY");
			
		}
	}

	@Override
	public void play() {
		if(currentState == READY){
			System.out.println("Start playing first track in album");
			currentState = PLAYING;
			System.out.println("playing");
		}else if(currentState == PAUSED){
			System.out.println("load the existing track from the correct timeframe");
			currentState = PLAYING;
			System.out.println("playing");
		}
	}

	@Override
	public void pause() {
		if(currentState == PLAYING){
			System.out.println("Store the current playing track and timeframe");
			System.out.println("Pause the player");
			currentState = PAUSED;
			System.out.println("Paused");

		}
	}

	@Override
	public void setCurrentState(IState state) {
		// TODO Auto-generated method stub

	}

}
