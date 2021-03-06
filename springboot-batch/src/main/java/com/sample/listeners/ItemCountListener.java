package com.sample.listeners;

import org.springframework.batch.core.ChunkListener;
import org.springframework.batch.core.scope.context.ChunkContext;

public class ItemCountListener implements ChunkListener {

	@Override
	public void beforeChunk(ChunkContext context) {
	}

	@Override
	public void afterChunk(ChunkContext context) {
		int count = context.getStepContext().getStepExecution().getReadCount();
		System.out.println("Total Values Read are : " + count);
	}

	@Override
	public void afterChunkError(ChunkContext context) {
	}
}