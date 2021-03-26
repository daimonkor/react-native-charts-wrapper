package com.github.wuxudong.rncharts.charts;

import com.github.mikephil.charting.components.AxisBase;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.formatter.IAxisValueFormatter;
import com.github.mikephil.charting.formatter.IValueFormatter;
import com.github.mikephil.charting.utils.ViewPortHandler;

import java.util.Map;

public class LabelByXValueFormatter implements IAxisValueFormatter, IValueFormatter {
    private Map<Float, String> labelsByXValue;

    public LabelByXValueFormatter(Map<Float, String> labelsByXValue) {
        this.labelsByXValue = labelsByXValue;
    }


    @Override
    public String getFormattedValue(float value, AxisBase axis) {
        String label = this.labelsByXValue.get(Float.valueOf(value));
        return (label != null) ? label : "";
    }

    @Override
    public String getFormattedValue(float value, Entry entry, int dataSetIndex, ViewPortHandler viewPortHandler) {
        return this.getFormattedValue(value, null);
    }
}
