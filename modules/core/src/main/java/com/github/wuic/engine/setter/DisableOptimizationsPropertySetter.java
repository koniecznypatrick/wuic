/*
 * "Copyright (c) 2013   Capgemini Technology Services (hereinafter "Capgemini")
 *
 * License/Terms of Use
 * Permission is hereby granted, free of charge and for the term of intellectual
 * property rights on the Software, to any person obtaining a copy of this software
 * and associated documentation files (the "Software"), to use, copy, modify and
 * propagate free of charge, anywhere in the world, all or part of the Software
 * subject to the following mandatory conditions:
 *
 * -   The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * Any failure to comply with the above shall automatically terminate the license
 * and be construed as a breach of these Terms of Use causing significant harm to
 * Capgemini.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED,
 * INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, PEACEFUL ENJOYMENT,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS
 * OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER
 * IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION
 * WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 *
 * Except as contained in this notice, the name of Capgemini shall not be used in
 * advertising or otherwise to promote the use or other dealings in this Software
 * without prior written authorization from Capgemini.
 *
 * These Terms of Use are subject to French law.
 *
 * IMPORTANT NOTICE: The WUIC software implements software components governed by
 * open source software licenses (BSD and Apache) of which CAPGEMINI is not the
 * author or the editor. The rights granted on the said software components are
 * governed by the specific terms and conditions specified by Apache 2.0 and BSD
 * licenses."
 */


package com.github.wuic.engine.setter;

import com.github.wuic.ApplicationConfig;
import com.github.wuic.engine.AbstractEngineBuilder;
import com.github.wuic.util.PropertySetter;

/**
 * <p>
 * Setter for the {@link com.github.wuic.ApplicationConfig#DISABLE_OPTIMIZATIONS} property.
 * </p>
 *
 * @author Guillaume DROUET
 * @version 1.0
 * @since 0.4.0
 */
public class DisableOptimizationsPropertySetter extends PropertySetter.PropertySetterOfBoolean {

    /**
     * <p>
     * Creates a new instance with a specific default value.
     * </p>
     *
     * @param b the {@link com.github.wuic.engine.AbstractEngineBuilder} which needs to be configured
     * @param defaultValue the default value
     */
    public DisableOptimizationsPropertySetter(final AbstractEngineBuilder b, final Object defaultValue) {
        super(b, defaultValue);
    }

    /**
     * <p>
     * Creates a new instance.
     * </p>
     *
     * @param b the {@link com.github.wuic.engine.AbstractEngineBuilder} which needs to be configured
     */
    public DisableOptimizationsPropertySetter(final AbstractEngineBuilder b) {
        this(b, true);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getPropertyKey() {
        return ApplicationConfig.DISABLE_OPTIMIZATIONS;
    }
}
