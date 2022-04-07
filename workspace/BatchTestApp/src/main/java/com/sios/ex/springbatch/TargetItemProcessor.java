package com.sios.ex.springbatch;

import org.springframework.batch.item.ItemProcessor;

public class TargetItemProcessor implements ItemProcessor<SourceItemEntity, TargetItemEntity> {

	@Override
	public TargetItemEntity process(SourceItemEntity item) throws Exception {
		if (item.isValid()) {
            return new TargetItemEntity(item.getName(), item.getValue());
        } else {
            return null;
        }
	}
}
