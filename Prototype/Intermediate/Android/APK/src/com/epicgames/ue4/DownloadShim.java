package com.epicgames.ue4;

import com.BouncyBerry.Prototype.OBBDownloaderService;
import com.BouncyBerry.Prototype.DownloaderActivity;


public class DownloadShim
{
	public static OBBDownloaderService DownloaderService;
	public static DownloaderActivity DownloadActivity;
	public static Class<DownloaderActivity> GetDownloaderType() { return DownloaderActivity.class; }
}

