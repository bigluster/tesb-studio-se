// ============================================================================
//
// Copyright (C) 2006-2012 Talend Inc. - www.talend.com
//
// This source code is available under agreement available at
// %InstallDIR%\features\org.talend.rcp.branding.%PRODUCTNAME%\%PRODUCTNAME%license.txt
//
// You should have received a copy of the agreement
// along with this program; if not, write to Talend SA
// 9 rue Pages 92150 Suresnes, France
//
// ============================================================================
package org.talend.camel.designer.prefs;

import org.talend.camel.designer.CamelDesignerPlugin;
import org.talend.repository.preference.MavenScriptPreferencePage;

/**
 * DOC ycbai class global comment. Detailled comment
 */
public class KarafMavenScriptPreferencePage extends MavenScriptPreferencePage {

    public KarafMavenScriptPreferencePage() {
        super();
        setPreferenceStore(CamelDesignerPlugin.getDefault().getPreferenceStore());
    }

    protected String getPreferenceKey() {
        return ICamelPrefConstants.MAVEN_KARAF_SCRIPT_TEMPLATE;
    }

}