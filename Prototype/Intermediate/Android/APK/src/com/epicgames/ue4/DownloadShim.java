package com.epicgames.ue4;

import com.company.Project.OBBDownloaderService;
import com.company.Project.DownloaderActivity;


public class DownloadShim
{
	public static OBBDownloaderService DownloaderService;
	public static DownloaderActivity DownloadActivity;
	public static Class<DownloaderActivity> GetDownloaderType() { return DownloaderActivity.class; }
}

