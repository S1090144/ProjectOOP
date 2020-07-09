package it.project.facebook.utils.stats;

import java.util.ArrayList;

import it.project.facebook.model.Photo;
import it.project.facebook.service.Download;

public class StatsPhotos {
	public String TypePhotos() {
		ArrayList<Photo> totPhotos = Download.getAllPhoto();
		int quadrate = 0;
		int orizzontali = 0;
		int verticali = 0;
		String t_photos = null;
		for (int i = 0; i < totPhotos.size(); i++) {
			if (totPhotos.get(i).getHeight() == totPhotos.get(i).getWidth()) {
				quadrate++;
			} else if (totPhotos.get(i).getHeight() > totPhotos.get(i).getWidth()) {
				verticali++;
			} else if (totPhotos.get(i).getHeight() < totPhotos.get(i).getWidth()) {
				orizzontali++;
			}
		}
		t_photos = "Le foto quadrate sono " + quadrate + ", quelle orizzontali " + orizzontali + " e quelle verticali "
				+ verticali;
		return t_photos;

	}
}
