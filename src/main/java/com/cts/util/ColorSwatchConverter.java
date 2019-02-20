package com.cts.util;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import com.cts.dto.ColorSwatch;
import com.cts.model.ColorSwatchVo;

@Component
public class ColorSwatchConverter implements Converter<ColorSwatch, ColorSwatchVo>{

	@Override
	public ColorSwatchVo convert(ColorSwatch source) {
		
		if(source==null)
			return null;
		
		ColorSwatchVo target = new ColorSwatchVo();
		
		target.setColor(source.getColor());
		target.setSkuid(source.getSkuId());
		//target.setRgbColor(source.getBasicColor());
		target.setRgbColor(ColorConverter.getRbgColor(source.getBasicColor()));
		
		return target;
	}

}
