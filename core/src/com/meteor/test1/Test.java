package com.meteor.test1;
import javax.swing.*;
import java.util.*;
import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.assets.loaders.ModelLoader;
import com.badlogic.gdx.audio.Music;
import com.badlogic.gdx.audio.Sound;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g3d.particles.influencers.ColorInfluencer.Random;
import com.badlogic.gdx.math.MathUtils;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.math.Vector3;
import com.badlogic.gdx.utils.Array;
import com.badlogic.gdx.utils.Null;
import com.badlogic.gdx.utils.ScreenUtils;
import com.badlogic.gdx.utils.TimeUtils;

import java.util.Iterator;

public class Test extends ApplicationAdapter {

	private Array<Rectangle> arr = new Array<Rectangle>();	
	int players = 0;
	//#region scaloneta image

	private Texture messiImage;
	private Texture acuñaImage;
	private Texture almadaImage;	
	private Texture armaniImage;
	private Texture beckamImage;
	private Texture coloImage;
	private Texture correaImage;
	private Texture cutiImage;
	private Texture dibuImage;
	private Texture dybalaImage;
	private Texture enzoImage;
	private Texture fideoImage;
	private Texture foythImage;
	private Texture julianImage;
	private Texture lautaImage;
	private Texture lichaImage;
	private Texture molinaImage;
	private Texture montielImage;
	private Texture otamendiImage;
	private Texture palaciosImage;
	private Texture paredesImage;
	private Texture paulImage;
	private Texture pezzelaImage;
	private Texture rodriguezImage;
	private Texture rulliImage;
	private Texture scaloniImage;
	private Texture tagliaImage;

	//#endregion

	private int scaloneta;
//#region boolean

	private boolean messiTaken = false;
	private boolean acuñaTaken = false;
	private boolean almadaTaken = false;
	private boolean armaniTaken = false;
	private boolean beckamTaken = false;
	private boolean coloTaken = false;
	private boolean correaTaken = false;
	private boolean cutiTaken = false;
	private boolean dibuTaken = false;
	private boolean dybalaTaken = false;
	private boolean enzoTaken = false;
	private boolean fideoTaken = false;
	private boolean foythTaken = false;
	private boolean julianTaken = false;
	private boolean lautaTaken = false;
	private boolean lichaTaken = false;
	private boolean molinaTaken = false;	
	private boolean montielTaken = false;
	private boolean otamendiTaken = false;
	private boolean palaciosTaken = false;
	private boolean paredesTaken = false;
	private boolean paulTaken = false;
	private boolean pezzelaTaken = false;
	private boolean rodriguezTaken = false;
	private boolean rulliTaken = false;
	private boolean tagliaTaken = false;

	
//#endregion




	private Texture bucketImage;
	private Sound dropSound;
	private Music rainMusic;
	private SpriteBatch batch;
	private OrthographicCamera camera;
	private Rectangle bucket;

	//#region array
	private Array<Rectangle> messiDrops;
	private Array<Rectangle> acuñaDrops;
	private Array<Rectangle> almadaDrops;
	private Array<Rectangle> armaniDrops;
	private Array<Rectangle> beckamDrops;
	private Array<Rectangle> coloDrops;
	private Array<Rectangle> correaDrops;
	private Array<Rectangle> cutiDrops;
	private Array<Rectangle> dibuDrops;
	private Array<Rectangle> dybalaDrops;
	private Array<Rectangle> enzoDrops;
	private Array<Rectangle> fideoDrops;
	private Array<Rectangle> foythDrops;
	private Array<Rectangle> julianDrops;
	private Array<Rectangle> lautaDrops;
	private Array<Rectangle> lichaDrops;
	private Array<Rectangle> molinaDrops;
	private Array<Rectangle> montielDrops;
	private Array<Rectangle> otamendiDrops;
	private Array<Rectangle> palaciosDrops;
	private Array<Rectangle> paredesDrops;
	private Array<Rectangle> paulDrops;
	private Array<Rectangle> pezzelaDrops;
	private Array<Rectangle> rodriguezDrops;
	private Array<Rectangle> rulliDrops;	
	private Array<Rectangle> tagliaDrops;
	
	//#endregion

	/*
	private long lastMessiDropTime;
	private long lastacuñaDropTime;
	private long lastalmadaDropTime;	
	private long lastarmaniDropTime;
	private long lastbeckamDropTime;
	private long lastcoloDropTime;
	private long lastcorreaDropTime;
	private long lastcutiDropTime;
	private long lastdibuDropTime;
	private long lastDybalaDropTime;
	private long lastenzoDropTime;
	private long lastfideoDropTime;
	private long lastfoythDropTime;
	private long lastjulianDropTime;
	private long lastlautaDropTime;
	private long lastlichaDropTime;
	private long lastmolinaDropTime;
	private long lastmontielDropTime;
	private long lastotamendiDropTime;
	private long lastpalaciosDropTime;
	private long lastparedesDropTime;
	private long lastpaulDropTime;
	private long lastpezzelaDropTime;
	private long lastrodriguezDropTime;
	private long lastrulliDropTime;
	private long lasttagliaDropTime;
	 */

/*
	private int score;
	private int scoreToShrink;
	*/

	@Override
	public void create() {

		
		// load the images for the droplet and the bucket, 64x64 pixels each
		//and the gameOverBall	

		//#region textures

		bucketImage = new Texture(Gdx.files.internal("scaloni.png"));
		messiImage = new Texture(Gdx.files.internal("messi2.png"));
		acuñaImage= new Texture(Gdx.files.internal("acuña.png"));
		almadaImage= new Texture(Gdx.files.internal("almada.png"));		
		armaniImage= new Texture(Gdx.files.internal("armani.png"));
		beckamImage= new Texture(Gdx.files.internal("beckam.png"));
		coloImage= new Texture(Gdx.files.internal("colo.png"));
		correaImage= new Texture(Gdx.files.internal("correa.png"));
		cutiImage= new Texture(Gdx.files.internal("cuti.png"));
		dibuImage= new Texture(Gdx.files.internal("dibu.png"));
		dybalaImage= new Texture(Gdx.files.internal("dybala.png"));
		enzoImage= new Texture(Gdx.files.internal("enzo.png"));
		fideoImage= new Texture(Gdx.files.internal("fideo.png"));
		foythImage= new Texture(Gdx.files.internal("foyth.png"));
		julianImage= new Texture(Gdx.files.internal("julian.png"));
		lautaImage= new Texture(Gdx.files.internal("lauta.png"));
		lichaImage= new Texture(Gdx.files.internal("licha.png"));
		molinaImage= new Texture(Gdx.files.internal("molina.png"));
		montielImage= new Texture(Gdx.files.internal("montiel.png"));
		otamendiImage= new Texture(Gdx.files.internal("otamendi.png"));
		palaciosImage= new Texture(Gdx.files.internal("palacios.png"));
		paredesImage= new Texture(Gdx.files.internal("paredes.png"));
		paulImage= new Texture(Gdx.files.internal("paul.png"));
		pezzelaImage= new Texture(Gdx.files.internal("pezzela.png"));
		rodriguezImage= new Texture(Gdx.files.internal("rodriguez.png"));
		rulliImage= new Texture(Gdx.files.internal("rulli.png"));
		tagliaImage= new Texture(Gdx.files.internal("taglia.png"));
		
//#endregion

		// load the drop sound effect and the rain background "music"
		dropSound = Gdx.audio.newSound(Gdx.files.internal("drop.wav"));
		rainMusic = Gdx.audio.newMusic(Gdx.files.internal("rain.mp3"));

		// start the playback of the background music immediately
		rainMusic.setLooping(true);
		rainMusic.play();

		// create the camera and the SpriteBatch
		camera = new OrthographicCamera();
		camera.setToOrtho(false, 650, 500);
		batch = new SpriteBatch();

		// create a Rectangle to logically represent the bucket
		bucket = new Rectangle();
		bucket.x = 650 / 2 - 64 / 2; // center the bucket horizontally
		bucket.y = 20; // bottom left corner of the bucket is 20 pixels above the bottom screen edge
		bucket.width = 64;
		bucket.height = 64;

		// create the raindrops array and spawn the first raindrop
		
		

		// create the acidRaindrops array and spawn the first ball
		
		

		// create the goldenRaindrops array and spawn the first ball
		//#region arraydefin

		messiDrops= new Array<Rectangle>();
		acuñaDrops= new Array<Rectangle>();
		almadaDrops= new Array<Rectangle>();		
		armaniDrops= new Array<Rectangle>();
		beckamDrops= new Array<Rectangle>();
		coloDrops= new Array<Rectangle>();
		correaDrops= new Array<Rectangle>();
		cutiDrops= new Array<Rectangle>();
		dibuDrops= new Array<Rectangle>();
		dybalaDrops= new Array<Rectangle>();
		enzoDrops= new Array<Rectangle>();
		fideoDrops= new Array<Rectangle>();
		foythDrops= new Array<Rectangle>();
		julianDrops= new Array<Rectangle>();
		lautaDrops= new Array<Rectangle>();
		lichaDrops= new Array<Rectangle>();
		molinaDrops= new Array<Rectangle>();
		montielDrops= new Array<Rectangle>();
		otamendiDrops= new Array<Rectangle>();
		palaciosDrops= new Array<Rectangle>();
		paredesDrops= new Array<Rectangle>();
		paulDrops= new Array<Rectangle>();
		pezzelaDrops= new Array<Rectangle>();
		rodriguezDrops= new Array<Rectangle>();
		rulliDrops= new Array<Rectangle>();
		tagliaDrops= new Array<Rectangle>();	
		//#endregion	
		
/* 
		spawnMessidrop();

		spawnacuñaDrop();
		spawnalmadaDrop();
		
		spawnarmaniDroP();
		spawnbeckamDrop();
		spawncoloDrop();
		spawncorreaDrop();
		spawncutiDrop();
		spawndibuDrop();
		spawndybalaDrop();
		spawnenzoDrop();
		spawnfideoDrop();
		spawnfoythDrop();
		spawnjulianDrop();
		spawnlautaDrop();
		spawnlichaDrop();
		spawnmolinaDrop();
		spawnmontielDrop();
		spawnotamendiDrop();
		spawnpalaciosDrop();
		spawnparedesDrop();
		spawnpaulDrop();
		spawnpezzelaDrop();
		spawnrodriguezDrop();
		spawnrulliDrops();
		spawntagliaDrop();
		*/

		//score = 0;

		//scoreToShrink = 10;
	}

	//#region spawns

	private void spawnMessidrop() {
		Rectangle messiDrop = new Rectangle();
		messiDrop.x = MathUtils.random(0, 650-64);
		messiDrop.y = 960;
		messiDrop.width = 64;
		messiDrop.height = 64;
		messiDrops.add(messiDrop);		
		//lastMessiDropTime = TimeUtils.nanoTime();
	}
	private void spawnacuñaDrop(){
		Rectangle acuñaDrop = new Rectangle();
		acuñaDrop.x = MathUtils.random(0, 650-64);
		acuñaDrop.y = 960;
		acuñaDrop.width = 64;
		acuñaDrop.height = 64;
		acuñaDrops.add(acuñaDrop);		
		//lastacuñaDropTime = TimeUtils.nanoTime();	
	}
	private void spawnalmadaDrop(){
		Rectangle alamadaDrop = new Rectangle();
		alamadaDrop.x = MathUtils.random(0, 650-64);
		alamadaDrop.y = 960;
		alamadaDrop.width = 64;
		alamadaDrop.height = 64;
		almadaDrops.add(alamadaDrop);		
		//lastalmadaDropTime = TimeUtils.nanoTime();
    }

	private void spawnarmaniDroP(){
		Rectangle armaniDrop = new Rectangle();
		armaniDrop.x = MathUtils.random(0, 650-64);
		armaniDrop.y = 960;
		armaniDrop.width = 64;
		armaniDrop.height = 64;
		armaniDrops.add(armaniDrop);		
		//lastarmaniDropTime = TimeUtils.nanoTime();
	}

	private void spawncoloDrop(){
		Rectangle coloDrop = new Rectangle();
		coloDrop.x = MathUtils.random(0, 650-64);
		coloDrop.y = 960;
		coloDrop.width = 64;
		coloDrop.height = 64;
		coloDrops.add(coloDrop);		
		//lastacuñaDropTime = TimeUtils.nanoTime();
	}	
	private void spawnbeckamDrop(){
		Rectangle beckamDrop = new Rectangle();
		beckamDrop.x = MathUtils.random(0, 650-64);
		beckamDrop.y = 960;
		beckamDrop.width = 64;
		beckamDrop.height = 64;
		beckamDrops.add(beckamDrop);		
		//lastbeckamDropTime = TimeUtils.nanoTime();
	}
	private void spawncorreaDrop(){
		Rectangle correaDrop = new Rectangle();
		correaDrop.x = MathUtils.random(0, 650-64);
		correaDrop.y = 960;
		correaDrop.width = 64;
		correaDrop.height = 64;
		correaDrops.add(correaDrop);		
		//lastcorreaDropTime = TimeUtils.nanoTime();
	}
	private void spawncutiDrop(){
		Rectangle cutiDrop = new Rectangle();
		cutiDrop.x = MathUtils.random(0, 650-64);
		cutiDrop.y = 960;
		cutiDrop.width = 64;
		cutiDrop.height = 64;
		cutiDrops.add(cutiDrop);		
		//lastcutiDropTime = TimeUtils.nanoTime();
	}
	private void spawndibuDrop(){
		Rectangle dibuDrop = new Rectangle();
		dibuDrop.x = MathUtils.random(0, 650-64);
		dibuDrop.y = 960;
		dibuDrop.width = 64;
		dibuDrop.height = 64;
		dibuDrops.add(dibuDrop);		
		//lastdibuDropTime = TimeUtils.nanoTime();
	}
	private void spawndybalaDrop(){
		Rectangle dybalaDrop = new Rectangle();
		dybalaDrop.x = MathUtils.random(0, 650-64);
		dybalaDrop.y = 960;
		dybalaDrop.width = 64;
		dybalaDrop.height = 64;
		dybalaDrops.add(dybalaDrop);		
		//lastDybalaDropTime = TimeUtils.nanoTime();
	}
	private void spawnenzoDrop(){
		Rectangle enzoDrop = new Rectangle();
		enzoDrop.x = MathUtils.random(0, 650-64);
		enzoDrop.y = 960;
		enzoDrop.width = 64;
		enzoDrop.height = 64;
		enzoDrops.add(enzoDrop);		
		//lastenzoDropTime = TimeUtils.nanoTime();
	}
	private void spawnfideoDrop(){
		Rectangle fideoDrop = new Rectangle();
		fideoDrop.x = MathUtils.random(0, 650-64);
		fideoDrop.y = 960;
		fideoDrop.width = 64;
		fideoDrop.height = 64;
		fideoDrops.add(fideoDrop);		
		//lastfideoDropTime = TimeUtils.nanoTime();
	}
	private void spawnfoythDrop(){
		Rectangle foythDrop = new Rectangle();
		foythDrop.x = MathUtils.random(0, 650-64);
		foythDrop.y = 960;
		foythDrop.width = 64;
		foythDrop.height = 64;
		foythDrops.add(foythDrop);		
		//lastfoythDropTime = TimeUtils.nanoTime();
	}
	private void spawnjulianDrop(){
		Rectangle julianDrop = new Rectangle();
		julianDrop.x = MathUtils.random(0, 650-64);
		julianDrop.y = 960;
		julianDrop.width = 64;
		julianDrop.height = 64;
		julianDrops.add(julianDrop);		
		//lastjulianDropTime = TimeUtils.nanoTime();
	}
	private void spawnlautaDrop(){
		Rectangle lautaDrop = new Rectangle();
		lautaDrop.x = MathUtils.random(0, 650-64);
		lautaDrop.y = 960;
		lautaDrop.width = 64;
		lautaDrop.height = 64;
		lautaDrops.add(lautaDrop);		
		//lastacuñaDropTime = TimeUtils.nanoTime();
	}
	private void spawnlichaDrop(){
		Rectangle lichaDrop = new Rectangle();
		lichaDrop.x = MathUtils.random(0, 650-64);
		lichaDrop.y = 960;
		lichaDrop.width = 64;
		lichaDrop.height = 64;
		lichaDrops.add(lichaDrop);		
		//lastlichaDropTime = TimeUtils.nanoTime();
	}
	private void spawnmolinaDrop(){
		Rectangle molinaDrop = new Rectangle();
		molinaDrop.x = MathUtils.random(0, 650-64);
		molinaDrop.y = 960;
		molinaDrop.width = 64;
		molinaDrop.height = 64;
		molinaDrops.add(molinaDrop);		
		//lastmolinaDropTime = TimeUtils.nanoTime();
	}
	private void spawnmontielDrop(){
		Rectangle montielDrop = new Rectangle();
		montielDrop.x = MathUtils.random(0, 650-64);
		montielDrop.y = 960;
		montielDrop.width = 64;
		montielDrop.height = 64;
		montielDrops.add(montielDrop);		
		//lastmontielDropTime = TimeUtils.nanoTime();
	}
	private void spawnotamendiDrop(){
		Rectangle otamendiDrop = new Rectangle();
		otamendiDrop.x = MathUtils.random(0, 650-64);
		otamendiDrop.y = 960;
		otamendiDrop.width = 64;
		otamendiDrop.height = 64;
		otamendiDrops.add(otamendiDrop);		
		//lastotamendiDropTime = TimeUtils.nanoTime();
	}
	private void spawnpalaciosDrop(){
		Rectangle palaciosDrop = new Rectangle();
		palaciosDrop.x = MathUtils.random(0, 650-64);
		palaciosDrop.y = 960;
		palaciosDrop.width = 64;
		palaciosDrop.height = 64;
		palaciosDrops.add(palaciosDrop);		
		//lastpalaciosDropTime = TimeUtils.nanoTime();
	}
	private void spawnparedesDrop(){
		Rectangle paredesDrop = new Rectangle();
		paredesDrop.x = MathUtils.random(0, 650-64);
		paredesDrop.y = 960;
		paredesDrop.width = 64;
		paredesDrop.height = 64;
		paredesDrops.add(paredesDrop);		
		//lastparedesDropTime = TimeUtils.nanoTime();
	}
	private void spawnpaulDrop(){
		Rectangle paulDrop = new Rectangle();
		paulDrop.x = MathUtils.random(0, 650-64);
		paulDrop.y = 960;
		paulDrop.width = 64;
		paulDrop.height = 64;
		paulDrops.add(paulDrop);		
		//lastpaulDropTime = TimeUtils.nanoTime();
	}
	private void spawnpezzelaDrop(){
		Rectangle pezzelaDrop = new Rectangle();
		pezzelaDrop.x = MathUtils.random(0, 650-64);
		pezzelaDrop.y = 960;
		pezzelaDrop.width = 64;
		pezzelaDrop.height = 64;
		pezzelaDrops.add(pezzelaDrop);		
		//lastpezzelaDropTime = TimeUtils.nanoTime();
	}
	private void spawnrodriguezDrop(){
		Rectangle rodriguezDrop = new Rectangle();
		rodriguezDrop.x = MathUtils.random(0, 650-64);
		rodriguezDrop.y = 960;
		rodriguezDrop.width = 64;
		rodriguezDrop.height = 64;
		rodriguezDrops.add(rodriguezDrop);		
		//lastrodriguezDropTime = TimeUtils.nanoTime();
	}
	private void spawnrulliDrops(){
		Rectangle rulliDrop = new Rectangle();
		rulliDrop.x = MathUtils.random(0, 650-64);
		rulliDrop.y = 960;
		rulliDrop.width = 64;
		rulliDrop.height = 64;
		rulliDrops.add(rulliDrop);		
		//lastrulliDropTime = TimeUtils.nanoTime();
	}
	private void spawntagliaDrop(){
		Rectangle tagliaDrop = new Rectangle();
		tagliaDrop.x = MathUtils.random(0, 650-64);
		tagliaDrop.y = 960;
		tagliaDrop.width = 64;
		tagliaDrop.height = 64;
		tagliaDrops.add(tagliaDrop);		
		//lasttagliaDropTime = TimeUtils.nanoTime();
	}
	
	 
		//#endregion
	

	@Override
	public void render() {
		// clear the screen with a dark blue color. The
		// arguments to clear are the red, green
		// blue and alpha component in the range [0,1]
		// of the color to be used to clear the screen.
		ScreenUtils.clear(0, 0, 0.2f, 1);

		// tell the camera to update its matrices.
		camera.update();

		// tell the SpriteBatch to render in the
		// coordinate system specified by the camera.
		batch.setProjectionMatrix(camera.combined);

		// begin a new batch and draw the bucket and
		// all drops and balls
		batch.begin();
		batch.draw(bucketImage, bucket.x, bucket.y);
		
		//#region fors

		for(Rectangle messiDrop: messiDrops) {
			batch.draw(messiImage, messiDrop.x, messiDrop.y);
		}
		for(Rectangle acuñaDrop: acuñaDrops) {
			batch.draw(acuñaImage, acuñaDrop.x, acuñaDrop.y);
		}
		for(Rectangle almadaDrop: almadaDrops) {
			batch.draw(almadaImage, almadaDrop.x, almadaDrop.y);
		}		
		for(Rectangle armaniDrop: armaniDrops) {
			batch.draw(armaniImage, armaniDrop.x, armaniDrop.y);
		}
		for(Rectangle beckamDrop: beckamDrops) {
			batch.draw(beckamImage, beckamDrop.x, beckamDrop.y);
		}
		for(Rectangle coloDrop: coloDrops) {
			batch.draw(coloImage, coloDrop.x, coloDrop.y);
		}
		for(Rectangle correaDrop: correaDrops) {
			batch.draw(correaImage, correaDrop.x, correaDrop.y);
		}
		for(Rectangle cutiDrop: cutiDrops) {
			batch.draw(cutiImage, cutiDrop.x, cutiDrop.y);
		}
		for(Rectangle dibuDrop: dibuDrops) {
			batch.draw(dibuImage, dibuDrop.x, dibuDrop.y);
		}
		for(Rectangle dybalaDrop: dybalaDrops) {
			batch.draw(dybalaImage, dybalaDrop.x, dybalaDrop.y);
		}
		for(Rectangle enzoDrop: enzoDrops) {
			batch.draw(enzoImage, enzoDrop.x, enzoDrop.y);
		}
		for(Rectangle fideoDrop: fideoDrops) {
			batch.draw(fideoImage, fideoDrop.x, fideoDrop.y);
		}
		for(Rectangle foythDrop: foythDrops) {
			batch.draw(foythImage, foythDrop.x, foythDrop.y);
		}
		for(Rectangle julianDrop: julianDrops) {
			batch.draw(julianImage, julianDrop.x, julianDrop.y);
		}
		for(Rectangle lautaDrop: lautaDrops) {
			batch.draw(lautaImage, lautaDrop.x, lautaDrop.y);
		}
		for(Rectangle lichaDrop: lichaDrops) {
			batch.draw(lichaImage, lichaDrop.x, lichaDrop.y);
		}
		for(Rectangle molinaDrop: molinaDrops) {
			batch.draw(molinaImage, molinaDrop.x, molinaDrop.y);
		}
		for(Rectangle montielDrop: montielDrops) {
			batch.draw(montielImage, montielDrop.x, montielDrop.y);
		}
		for(Rectangle otamendiDrop: otamendiDrops) {
			batch.draw(otamendiImage, otamendiDrop.x, otamendiDrop.y);
		}
		for(Rectangle palaciosDrop: palaciosDrops) {
			batch.draw(palaciosImage, palaciosDrop.x, palaciosDrop.y);
		}
		for(Rectangle paredesDrop: paredesDrops) {
			batch.draw(paredesImage, paredesDrop.x, paredesDrop.y);
		}
		for(Rectangle paulDrop: paulDrops) {
			batch.draw(paulImage, paulDrop.x, paulDrop.y);
		}
		for(Rectangle pezzelaDrop: pezzelaDrops) {
			batch.draw(pezzelaImage, pezzelaDrop.x, pezzelaDrop.y);
		}
		for(Rectangle rodriguezDrop: rodriguezDrops) {
			batch.draw(rodriguezImage, rodriguezDrop.x, rodriguezDrop.y);
		}
		for(Rectangle rulliDrop: rulliDrops) {
			batch.draw(rulliImage, rulliDrop.x, rulliDrop.y);
		}
		for(Rectangle tagliaDrop: tagliaDrops) {
			batch.draw(tagliaImage, tagliaDrop.x, tagliaDrop.y);
		}

		//#endregion

		
		
		batch.end();

		// process user input
		if(Gdx.input.isTouched()) {
			Vector3 touchPos = new Vector3();
			touchPos.set(Gdx.input.getX(), Gdx.input.getY(), 0);
			camera.unproject(touchPos);
			bucket.x = touchPos.x - 64 / 2;
			bucket.y = touchPos.y - 64 / 2;
		}
		if(Gdx.input.isKeyPressed(Input.Keys.LEFT)) bucket.x -= 200 * Gdx.graphics.getDeltaTime();
		if(Gdx.input.isKeyPressed(Input.Keys.RIGHT)) bucket.x += 200 * Gdx.graphics.getDeltaTime();

		// make sure the bucket stays within the screen bounds
		if(bucket.x < 0) bucket.x = 0;
		if(bucket.x > 800 - 64) bucket.x = 650 - 64;
		if(bucket.y < 0) bucket.y = 0;
		if(bucket.y > 800 - 64) bucket.y = 960 - 64;

		// check if we need to create a new raindrop, acidRaindrop or goldenRaindrop
		/* 
		if(TimeUtils.nanoTime() - lastMessiDropTime > 1000010000) spawnMessidrop();
		if(TimeUtils.nanoTime() - lastacuñaDropTime > 1500020000) spawnacuñaDrop();
		if(TimeUtils.nanoTime() - lastalmadaDropTime > 1200500000) spawnalmadaDrop();		
		if(TimeUtils.nanoTime() - lastarmaniDropTime > 1900000000) spawnarmaniDroP();
		if(TimeUtils.nanoTime() - lastbeckamDropTime > 200000000) spawnbeckamDrop();
		if(TimeUtils.nanoTime() - lastcoloDropTime > 300000000) spawncoloDrop();
		if(TimeUtils.nanoTime() - lastcorreaDropTime > 400000000) spawncorreaDrop();
		if(TimeUtils.nanoTime() - lastcutiDropTime > 500000000) spawncutiDrop();
		if(TimeUtils.nanoTime() - lastdibuDropTime > 800000000) spawndibuDrop();
		if(TimeUtils.nanoTime() - lastDybalaDropTime > 1000000000) spawndybalaDrop();
		if(TimeUtils.nanoTime() - lastenzoDropTime > 1000000000) spawnenzoDrop();
		if(TimeUtils.nanoTime() - lastfideoDropTime > 1000000000) spawnfideoDrop();
		if(TimeUtils.nanoTime() - lastfoythDropTime > 1000000000) spawnfoythDrop();
		if(TimeUtils.nanoTime() - lastjulianDropTime > 1000000000) spawnjulianDrop();
		if(TimeUtils.nanoTime() - lastlautaDropTime > 1000000000) spawnlautaDrop();
		if(TimeUtils.nanoTime() - lastlichaDropTime > 1000000000) spawnlichaDrop();
		if(TimeUtils.nanoTime() - lastmolinaDropTime > 1000000000) spawnmolinaDrop();
		if(TimeUtils.nanoTime() - lastmontielDropTime > 1000000000) spawnmontielDrop();
		if(TimeUtils.nanoTime() - lastotamendiDropTime > 1000000000) spawnotamendiDrop();
		if(TimeUtils.nanoTime() - lastpalaciosDropTime > 1000000000) spawnpalaciosDrop();
		if(TimeUtils.nanoTime() - lastparedesDropTime > 1000000000) spawnparedesDrop();
		if(TimeUtils.nanoTime() - lastpaulDropTime > 1000000000) spawnpaulDrop();
		if(TimeUtils.nanoTime() - lastpezzelaDropTime > 1000000000)	spawnpezzelaDrop();
		if(TimeUtils.nanoTime() - lastrodriguezDropTime > 1000000000) spawnrodriguezDrop();
		if(TimeUtils.nanoTime() - lastrulliDropTime > 1000000000) spawnrulliDrops();
		if(TimeUtils.nanoTime() - lasttagliaDropTime > 1000000000) spawntagliaDrop();
		*/

		//#region random

		int i = MathUtils.random(0, 500);
		if(i == 0){
			spawnMessidrop();
		}
		else if(i == 1){
			spawnacuñaDrop();
		}
		else if(i == 2){
			spawnbeckamDrop();
		}
		else if(i == 3){
			spawncoloDrop();
		}
		else if(i == 4){
			spawncorreaDrop();
		}
		else if(i == 5){
			spawncutiDrop();
		}
		else if(i == 6){
			spawndybalaDrop();
		}
		else if(i == 7){
			spawnenzoDrop();
		}
		else if(i == 8){
			spawnfideoDrop();
		}
		else if(i == 9){			
			spawnfoythDrop();
		}
		else if(i == 10){
			spawnjulianDrop();
		}
		else if(i == 11){
			spawnlautaDrop();	
		}
		else if(i == 12){
			spawnlichaDrop();
		}
		else if(i == 13){
			spawnmolinaDrop();
		}
		else if(i == 14){
			spawnmontielDrop();	 
		}
		else if(i == 15){
			spawnotamendiDrop();	
		}
		else if(i == 16){
			spawnpalaciosDrop();			
		}
		else if(i == 17){
			spawnparedesDrop();				
		}
		else if(i == 18){
			spawnpaulDrop();			
		}
		else if(i == 19){
			spawnpezzelaDrop();			
		}
		else if(i == 20){
			spawnrodriguezDrop();			   
		}
		else if(i == 21){
			spawnrulliDrops();		   
		}
		else if(i == 22){
			spawntagliaDrop();
		}
		else if(i == 23){
			spawnarmaniDroP();
		}
		else if(i == 24){
			spawnalmadaDrop();
		}
		else if(i == 25){
			spawndibuDrop();
		}

		//#endregion

		// move the raindrops, remove any that are beneath the bottom edge of
		// the screen or that hit the bucket. In the latter case we play back
		// a sound effect as well.
		/*/
		for (Iterator<Rectangle> iter = raindrops.iterator(); iter.hasNext(); ) {
			Rectangle raindrop = iter.next();
			raindrop.y -= 250 * Gdx.graphics.getDeltaTime();
			if(raindrop.y + 64 < 0) iter.remove();
			if(raindrop.overlaps(bucket)) {
				dropSound.play();
				score += 1;
				iter.remove();
			}
		}

		*/
		// move the gameOverBalls, remove any that are beneath the bottom edge of
		// the screen. If any hits the bucket, the game ends.	
		

		//#region spawner

		for (Iterator<Rectangle> iter = messiDrops.iterator(); iter.hasNext(); ) {
			Rectangle messiDrop = iter.next();
			messiDrop.y -= 250 * Gdx.graphics.getDeltaTime();
			if(messiDrop.y + 64 < 0) iter.remove();
			if(messiDrop.overlaps(bucket)) {
				dropSound.play();
				if(!messiTaken){
					messiTaken = true;
					scaloneta++;
					arr.add(messiDrop);
				}
				//vect[0]=messiDrop;
				//score += 1;
				iter.remove();
			}
		}

		for (Iterator<Rectangle> iter = acuñaDrops.iterator(); iter.hasNext(); ) {
			Rectangle acuñaDrop = iter.next();
			acuñaDrop.y -= 250 * Gdx.graphics.getDeltaTime();
			if(acuñaDrop.y + 64 < 0) iter.remove();
			if(acuñaDrop.overlaps(bucket)) {
				dropSound.play();
				if(!acuñaTaken){
					acuñaTaken = true;
					scaloneta++;
					arr.add(acuñaDrop);
				}
				//vect[1]=acuñaDrop;
				//score += 1;
				iter.remove();
			}
		}
		for (Iterator<Rectangle> iter = almadaDrops.iterator(); iter.hasNext(); ) {
			Rectangle almadaDrop = iter.next();
			almadaDrop.y -= 250 * Gdx.graphics.getDeltaTime();
			if(almadaDrop.y + 64 < 0) iter.remove();
			if(almadaDrop.overlaps(bucket)) {
				dropSound.play();
				if(!almadaTaken){
					almadaTaken = true;
					scaloneta++;
					arr.add(almadaDrop);
				}
				//vect[2]=almadaDrop;
				//score += 1;
				iter.remove();
			}
		}

		
		for (Iterator<Rectangle> iter = armaniDrops.iterator(); iter.hasNext(); ) {
			Rectangle armaniDrop = iter.next();
			armaniDrop.y -= 250 * Gdx.graphics.getDeltaTime();
			if(armaniDrop.y + 64 < 0) iter.remove();
			if(armaniDrop.overlaps(bucket)) {
				dropSound.play();
				if(!armaniTaken){
					armaniTaken = true;
					scaloneta++;
					arr.add(armaniDrop);
				}
				//vect[3]=armaniDrop;
				//score += 1;
				iter.remove();
			}
		}
		for (Iterator<Rectangle> iter = beckamDrops.iterator(); iter.hasNext(); ) {
			Rectangle beckamDrop = iter.next();
			beckamDrop.y -= 250 * Gdx.graphics.getDeltaTime();
			if(beckamDrop.y + 64 < 0) iter.remove();
			if(beckamDrop.overlaps(bucket)) {
				dropSound.play();
				if(!beckamTaken){
					beckamTaken = true;
					scaloneta++;
					arr.add(beckamDrop);
				}
				//vect[4]=beckamDrop;
				//score += 1;
				iter.remove();
			}
		}
		for (Iterator<Rectangle> iter = coloDrops.iterator(); iter.hasNext(); ) {
			Rectangle coloDrop = iter.next();
			coloDrop.y -= 250 * Gdx.graphics.getDeltaTime();
			if(coloDrop.y + 64 < 0) iter.remove();
			if(coloDrop.overlaps(bucket)) {
				dropSound.play();
				if(!coloTaken){
					coloTaken = true;
					scaloneta++;
					arr.add(coloDrop);
				}
				//vect[5]=coloDrop;
				//score += 1;
				iter.remove();
			}
		}
		for (Iterator<Rectangle> iter = correaDrops.iterator(); iter.hasNext(); ) {
			Rectangle correaDrop = iter.next();
			correaDrop.y -= 250 * Gdx.graphics.getDeltaTime();
			if(correaDrop.y + 64 < 0) iter.remove();
			if(correaDrop.overlaps(bucket)) {
				dropSound.play();
				if(!correaTaken){
					correaTaken = true;
					scaloneta++;
					arr.add(correaDrop);
				}
				//vect[6]=correaDrop;
				//score += 1;
				iter.remove();
			}
		}
		for (Iterator<Rectangle> iter = cutiDrops.iterator(); iter.hasNext(); ) {
			Rectangle cutiDrop = iter.next();
			cutiDrop.y -= 250 * Gdx.graphics.getDeltaTime();
			if(cutiDrop.y + 64 < 0) iter.remove();
			if(cutiDrop.overlaps(bucket)) {
				dropSound.play();
				if(!cutiTaken){
					cutiTaken = true;
					scaloneta++;
					arr.add(cutiDrop);
				}
				//vect[7]=cutiDrop;
				//score += 1;
				iter.remove();
			}
		}
		for (Iterator<Rectangle> iter = dibuDrops.iterator(); iter.hasNext(); ) {
			Rectangle dibuDrop = iter.next();
			dibuDrop.y -= 250 * Gdx.graphics.getDeltaTime();
			if(dibuDrop.y + 64 < 0) iter.remove();
			if(dibuDrop.overlaps(bucket)) {
				dropSound.play();
				if(!dibuTaken){
					dibuTaken = true;
					scaloneta++;
					arr.add(dibuDrop);
				}
				//vect[8]=dibuDrop;
				//score += 1;
				iter.remove();
			}
		}
		for (Iterator<Rectangle> iter = dybalaDrops.iterator(); iter.hasNext(); ) {
			Rectangle dybalaDrop = iter.next();
			dybalaDrop.y -= 250 * Gdx.graphics.getDeltaTime();
			if(dybalaDrop.y + 64 < 0) iter.remove();
			if(dybalaDrop.overlaps(bucket)) {
				dropSound.play();
				if(!dybalaTaken){
					dybalaTaken = true;
					scaloneta++;
					arr.add(dybalaDrop);
				}
				//vect[9]=dybalaDrop;
				//score += 1;
				iter.remove();
			}
		}
		for (Iterator<Rectangle> iter = enzoDrops.iterator(); iter.hasNext(); ) {
			Rectangle enzoDrop = iter.next();
			enzoDrop.y -= 250 * Gdx.graphics.getDeltaTime();
			if(enzoDrop.y + 64 < 0) iter.remove();
			if(enzoDrop.overlaps(bucket)) {
				dropSound.play();
				if(!enzoTaken){
					enzoTaken = true;
					scaloneta++;
					arr.add(enzoDrop);
				}
				//vect[10]= enzoDrop;
				//score += 1;
				iter.remove();
			}
		}
		for (Iterator<Rectangle> iter = fideoDrops.iterator(); iter.hasNext(); ) {
			Rectangle fideoDrop = iter.next();
			fideoDrop.y -= 250 * Gdx.graphics.getDeltaTime();
			if(fideoDrop.y + 64 < 0) iter.remove();
			if(fideoDrop.overlaps(bucket)) {
				dropSound.play();
				if(!fideoTaken){
					fideoTaken = true;
					scaloneta++;
					arr.add(fideoDrop);
				}
				//vect[11]= fideoDrop;
				//score += 1;
				iter.remove();
			}
		}
		for (Iterator<Rectangle> iter = foythDrops.iterator(); iter.hasNext(); ) {
			Rectangle foythDrop = iter.next();
			foythDrop.y -= 250 * Gdx.graphics.getDeltaTime();
			if(foythDrop.y + 64 < 0) iter.remove();
			if(foythDrop.overlaps(bucket)) {
				dropSound.play();
				if(!foythTaken){
					foythTaken = true;
					scaloneta++;
					arr.add(foythDrop);
				}
				//vect[12]=foythDrop;
				//score += 1;
				iter.remove();
			}
		}
		for (Iterator<Rectangle> iter = julianDrops.iterator(); iter.hasNext(); ) {
			Rectangle julianDrop = iter.next();
			julianDrop.y -= 250 * Gdx.graphics.getDeltaTime();
			if(julianDrop.y + 64 < 0) iter.remove();
			if(julianDrop.overlaps(bucket)) {
				dropSound.play();
				if(!julianTaken){
					julianTaken = true;
					scaloneta++;
					arr.add(julianDrop);
				}
				//vect[13]=julianDrop;
				//score += 1;
				iter.remove();
			}
		}
		for (Iterator<Rectangle> iter = lautaDrops.iterator(); iter.hasNext(); ) {
			Rectangle lautaDrop = iter.next();
			lautaDrop.y -= 250 * Gdx.graphics.getDeltaTime();
			if(lautaDrop.y + 64 < 0) iter.remove();
			if(lautaDrop.overlaps(bucket)) {
				dropSound.play();
				if(!lautaTaken){
					lautaTaken = true;
					scaloneta++;
					arr.add(lautaDrop);
				}
				//vect[14]=lautaDrop;
				//score += 1;
				iter.remove();
			}
		}
		for (Iterator<Rectangle> iter = lichaDrops.iterator(); iter.hasNext(); ) {
			Rectangle lichaDrop = iter.next();
			lichaDrop.y -= 250 * Gdx.graphics.getDeltaTime();
			if(lichaDrop.y + 64 < 0) iter.remove();
			if(lichaDrop.overlaps(bucket)) {
				dropSound.play();
				if(!lichaTaken){
					lichaTaken = true;
					scaloneta++;
					arr.add(lichaDrop);
				}
				//vect[15]=lichaDrop;
				//score += 1;
				iter.remove();
			}
		}
		for (Iterator<Rectangle> iter = molinaDrops.iterator(); iter.hasNext(); ) {
			Rectangle molinaDrop = iter.next();
			molinaDrop.y -= 250 * Gdx.graphics.getDeltaTime();
			if(molinaDrop.y + 64 < 0) iter.remove();
			if(molinaDrop.overlaps(bucket)) {
				dropSound.play();
				if(!molinaTaken){
					molinaTaken = true;
					scaloneta++;
					arr.add(molinaDrop);
				}
				//vect[16]=molinaDrop;
				//score += 1;
				iter.remove();
			}
		}
		for (Iterator<Rectangle> iter = montielDrops.iterator(); iter.hasNext(); ) {
			Rectangle montielDrop = iter.next();
			montielDrop.y -= 250 * Gdx.graphics.getDeltaTime();
			if(montielDrop.y + 64 < 0) iter.remove();
			if(montielDrop.overlaps(bucket)) {
				dropSound.play();
				if(!montielTaken){
					montielTaken = true;
					scaloneta++;
					arr.add(montielDrop);
				}
				//vect[17]=montielDrop;
				//score += 1;
				iter.remove();
			}
		}
		for (Iterator<Rectangle> iter = otamendiDrops.iterator(); iter.hasNext(); ) {
			Rectangle otamendiDrop = iter.next();
			otamendiDrop.y -= 250 * Gdx.graphics.getDeltaTime();
			if(otamendiDrop.y + 64 < 0) iter.remove();
			if(otamendiDrop.overlaps(bucket)) {
				dropSound.play();
				if(!otamendiTaken){
					otamendiTaken = true;
					scaloneta++;
					arr.add(otamendiDrop);
				}
				//vect[18]=otamendiDrop;
				//score += 1;
				iter.remove();
			}
		}
		for (Iterator<Rectangle> iter = paredesDrops.iterator(); iter.hasNext(); ) {
			Rectangle paredesDrop = iter.next();
			paredesDrop.y -= 250 * Gdx.graphics.getDeltaTime();
			if(paredesDrop.y + 64 < 0) iter.remove();
			if(paredesDrop.overlaps(bucket)) {
				dropSound.play();
				if(!paredesTaken){
					paredesTaken = true;
					scaloneta++;
					arr.add(paredesDrop);
				}
				//vect[19]=paredesDrop;
				//score += 1;
				iter.remove();
			}
		}
		for (Iterator<Rectangle> iter = paulDrops.iterator(); iter.hasNext(); ) {
			Rectangle paulDrop = iter.next();
			paulDrop.y -= 250 * Gdx.graphics.getDeltaTime();
			if(paulDrop.y + 64 < 0) iter.remove();
			if(paulDrop.overlaps(bucket)) {
				dropSound.play();
				if(!paulTaken){
					paulTaken = true;
					scaloneta++;
					arr.add(paulDrop);
				}
				//score += 1;
				//vect[20]=paulDrop;
				iter.remove();
			}
		}
		for (Iterator<Rectangle> iter = pezzelaDrops.iterator(); iter.hasNext(); ) {
			Rectangle pezzelaDrop = iter.next();
			pezzelaDrop.y -= 250 * Gdx.graphics.getDeltaTime();
			if(pezzelaDrop.y + 64 < 0) iter.remove();
			if(pezzelaDrop.overlaps(bucket)) {
				dropSound.play();
				if(!pezzelaTaken){
					pezzelaTaken = true;
					scaloneta++;
					arr.add(pezzelaDrop);
				}
				//vect[21]=pezzelaDrop;
				//score += 1;
				iter.remove();
			}
		}
		for (Iterator<Rectangle> iter = rodriguezDrops.iterator(); iter.hasNext(); ) {
			Rectangle rodriguezDrop = iter.next();
			rodriguezDrop.y -= 250 * Gdx.graphics.getDeltaTime();
			if(rodriguezDrop.y + 64 < 0) iter.remove();
			if(rodriguezDrop.overlaps(bucket)) {
				dropSound.play();
				if(!rodriguezTaken){
					rodriguezTaken = true;
					scaloneta++;
					arr.add(rodriguezDrop);
				}
				//vect[22]=rodriguezDrop;
				//score += 1;
				iter.remove();
			}
		}
		for (Iterator<Rectangle> iter = rulliDrops.iterator(); iter.hasNext(); ) {
			Rectangle rulliDrop = iter.next();
			rulliDrop.y -= 250 * Gdx.graphics.getDeltaTime();
			if(rulliDrop.y + 64 < 0) iter.remove();
			if(rulliDrop.overlaps(bucket)) {
				dropSound.play();
				if(!rulliTaken){
					rulliTaken = true;
					scaloneta++;
					arr.add(rulliDrop);
				}
				//vect[23]=rulliDrop;
				//score += 1;
				iter.remove();
			}
		}
		for (Iterator<Rectangle> iter = tagliaDrops.iterator(); iter.hasNext(); ) {
			Rectangle tagliaDrop = iter.next();
			tagliaDrop.y -= 250 * Gdx.graphics.getDeltaTime();
			if(tagliaDrop.y + 64 < 0) iter.remove();
			if(tagliaDrop.overlaps(bucket)) {
				dropSound.play();
				if(!tagliaTaken){
					tagliaTaken = true;
					scaloneta++;
					arr.add(tagliaDrop);
				}
				//score += 1;
				//vect[24]=tagliaDrop;
				iter.remove();
			}
		}		
		for (Iterator<Rectangle> iter = palaciosDrops.iterator(); iter.hasNext(); ) {
			Rectangle palaciosDrop = iter.next();
			palaciosDrop.y -= 250 * Gdx.graphics.getDeltaTime();
			if(palaciosDrop.y + 64 < 0) iter.remove();
			if(palaciosDrop.overlaps(bucket)) {
				dropSound.play();
				if(!palaciosTaken){
					palaciosTaken = true;
					scaloneta++;
					arr.add(palaciosDrop);
				}
				//vect[25]=palaciosDrop;
				//score += 1;
				iter.remove();
			}
		}

//#endregion

		if(scaloneta >= 26){
			JFrame jFrame = new JFrame();
			JOptionPane.showMessageDialog(jFrame, "Completaste la Scaloneta! ahora a ganar utro mundial pibe");

		}
		
		
		//checkScore();
		

	}


	@Override
	public void dispose() {
		// dispose of all the native resources

		//#region dispose
		bucketImage.dispose();
		dropSound.dispose();
		rainMusic.dispose();
		batch.dispose();
		messiImage.dispose();
		acuñaImage.dispose();
		almadaImage.dispose();
		armaniImage.dispose();
		beckamImage.dispose();
		coloImage.dispose();
		correaImage.dispose();
		cutiImage.dispose();
		dibuImage.dispose();
		dybalaImage.dispose();
		enzoImage.dispose();
		fideoImage.dispose();
		foythImage.dispose();
		julianImage.dispose();
		lautaImage.dispose();
		lichaImage.dispose();		
		molinaImage.dispose();
		montielImage.dispose();
		otamendiImage.dispose();
		palaciosImage.dispose();
		paredesImage.dispose();
		paulImage.dispose();
		pezzelaImage.dispose();
		rodriguezImage.dispose();
		rulliImage.dispose();
		scaloniImage.dispose();
		tagliaImage.dispose();
		//#endregion


	}
}
