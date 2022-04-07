package com.sios.ex.springbatch;

import org.springframework.batch.item.ItemProcessor;

public class LargeItemProcessor implements ItemProcessor<TargetItemEntity, LargeItemEntity> {
 
	/**
	 * 
	 * targetItemレコードの、nameとvalueを大文字にして返却する
	 */
    @Override
    public LargeItemEntity process(TargetItemEntity item) throws Exception {
        return new LargeItemEntity(
                item.getName().toUpperCase(),
                item.getValue().toUpperCase());
    }
}