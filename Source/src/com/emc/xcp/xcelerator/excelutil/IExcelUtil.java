package com.emc.xcp.xcelerator.excelutil;

import com.documentum.fc.common.DfException;
import com.emc.xcp.xcelerator.excelutil.params.CreatedDocumentId;
import com.emc.xcp.xcelerator.excelutil.params.NewObjectParams;
import com.emc.xcp.xcelerator.excelutil.params.ReadColumnWithValues;
import com.emc.xcp.xcelerator.excelutil.params.ReadingOptions;
import com.emc.xcp.xcelerator.excelutil.params.SheetReadRequest;
import com.emc.xcp.xcelerator.excelutil.params.StoreValuesParams;

/**
 * Defines operations performed on an Excel sheet
 * @author Michal.Malczewski
 *
 */
public interface IExcelUtil {

	/**
	 * Replaces contents of a sheet in the workbook with given values
	 */
	void storeValuesInExistingSheet(StoreValuesParams parmas) throws DfException;
	
	/**
	 * Manipulates the sheet and saves the result as a new object
	 */
	CreatedDocumentId storeValuesAsCopy(StoreValuesParams manipulationParams, NewObjectParams newObjectParams) throws DfException;
	
	/**
	 * Reads a sheet in the workbook 
	 */
	ReadColumnWithValues[] readSheet(SheetReadRequest readRequest, ReadingOptions readingOptions) throws DfException;
}
