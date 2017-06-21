package com.github.cunvoas.mediabackup.job;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author CUNVOAS
 */
public class Job {

	private static final Logger LOGGER = LoggerFactory .getLogger(Job.class);
	
	protected File destinationForder = null;

	public Job(File destinationForder) throws IOException, FileNotFoundException {
		super();
		this.destinationForder = destinationForder;
	}

	public void process(File mediaFile) throws IOException {
		LOGGER.info(mediaFile.getAbsolutePath());
		
		
		FileUtils.copyFile(mediaFile, destFile);
	}

}
