package fr.codinbox.visfx.network.config;

public class EdgesOption {

    private ArrowsConfiguration arrows;
    private EndPointOffsetConfiguration endPointOffset;
    private Boolean arrowStrikethrough;
    private Boolean chosen;
    private ColorConfiguration color;
    private Boolean dashes;
    private FontConfiguration font;
    private Boolean hidden;
    private Double hoverWidth;
    private String label;
    private Boolean labelHighlightBold;
    private Double length;
    private Boolean physics;
    private ScalingConfiguration scaling;
    private Double selectionWidth;
    private Double selfReferenceSize;
    private SelfReferenceConfiguration selfReference;
    private ShadowConfiguration shadow;
    private SmoothConfiguration smooth;
    private String title;
    private String to;
    private Double value;
    private Double width;
    private WidthConstraintConfiguration widthConstraint;

    public static class ArrowsConfiguration {

        private ArrowConfiguration to;
        private ArrowConfiguration middle;
        private ArrowConfiguration from;

        public static class ArrowConfiguration {

            private Boolean enabled;
            private Integer imageHeight;
            private Integer imageWidth;
            private Double scaleFactor;
            private String src;
            private ArrowType type;

            public Boolean getEnabled() {
                return enabled;
            }

            public ArrowConfiguration setEnabled(Boolean enabled) {
                this.enabled = enabled;
                return this;
            }

            public Integer getImageHeight() {
                return imageHeight;
            }

            public ArrowConfiguration setImageHeight(Integer imageHeight) {
                this.imageHeight = imageHeight;
                return this;
            }

            public Integer getImageWidth() {
                return imageWidth;
            }

            public ArrowConfiguration setImageWidth(Integer imageWidth) {
                this.imageWidth = imageWidth;
                return this;
            }

            public Double getScaleFactor() {
                return scaleFactor;
            }

            public ArrowConfiguration setScaleFactor(Double scaleFactor) {
                this.scaleFactor = scaleFactor;
                return this;
            }

            public String getSrc() {
                return src;
            }

            public ArrowConfiguration setSrc(String src) {
                this.src = src;
                return this;
            }

            public ArrowType getType() {
                return type;
            }

            public ArrowConfiguration setType(ArrowType type) {
                this.type = type;
                return this;
            }

            public enum ArrowType {
                ARROW,
                BAR,
                CIRCLE,
                IMAGE;

                @Override
                public String toString() {
                    return name().toLowerCase();
                }
            }

        }

    }
    public static class EndPointOffsetConfiguration {

        private Double from;
        private Double to;

        public Double getFrom() {
            return from;
        }

        public EndPointOffsetConfiguration setFrom(Double from) {
            this.from = from;
            return this;
        }

        public Double getTo() {
            return to;
        }

        public EndPointOffsetConfiguration setTo(Double to) {
            this.to = to;
            return this;
        }

    }
    public static class ColorConfiguration {

        private String color;
        private String highlight;
        private String hover;
        private String inherit;
        private Float opacity;

        public String getColor() {
            return color;
        }

        public ColorConfiguration setColor(String color) {
            this.color = color;
            return this;
        }

        public String getHighlight() {
            return highlight;
        }

        public ColorConfiguration setHighlight(String highlight) {
            this.highlight = highlight;
            return this;
        }

        public String getHover() {
            return hover;
        }

        public ColorConfiguration setHover(String hover) {
            this.hover = hover;
            return this;
        }

        public String getInherit() {
            return inherit;
        }

        public ColorConfiguration setInherit(String inherit) {
            this.inherit = inherit;
            return this;
        }

        public Float getOpacity() {
            return opacity;
        }

        public ColorConfiguration setOpacity(Float opacity) {
            this.opacity = opacity;
            return this;
        }

    }
    public static class FontConfiguration {

        private String color;
        private Integer size;
        private String face;
        private String background;
        private Integer strokeWidth;
        private String strokeColor;
        private FontAlign align;
        private Boolean multi;
        private Double vadjust;
        private FontDescriptor bold;
        private FontDescriptor ital;
        private FontDescriptor boldital;
        private FontDescriptor mono;

        public enum FontAlign {
            HORIZONTAL,
            TOP,
            MIDDLE,
            BOTTOM;

            @Override
            public String toString() {
                return name().toLowerCase();
            }
        }

        public static class FontDescriptor {

            private String color;
            private Integer size;
            private String face;
            private Double vadjust;
            private String mod;

            public String getColor() {
                return color;
            }

            public FontDescriptor setColor(String color) {
                this.color = color;
                return this;
            }

            public Integer getSize() {
                return size;
            }

            public FontDescriptor setSize(Integer size) {
                this.size = size;
                return this;
            }

            public String getFace() {
                return face;
            }

            public FontDescriptor setFace(String face) {
                this.face = face;
                return this;
            }

            public Double getVadjust() {
                return vadjust;
            }

            public FontDescriptor setVadjust(Double vadjust) {
                this.vadjust = vadjust;
                return this;
            }

            public String getMod() {
                return mod;
            }

            public FontDescriptor setMod(String mod) {
                this.mod = mod;
                return this;
            }

        }
    }
    public static class ScalingConfiguration {

        private Double min;
        private Double max;
        private LabelConfiguration label;

        public static class LabelConfiguration {

            private Boolean enabled;
            private Double min;
            private Double max;
            private Double maxVisible;
            private Double drawThreshold;

            public Boolean getEnabled() {
                return enabled;
            }

            public LabelConfiguration setEnabled(Boolean enabled) {
                this.enabled = enabled;
                return this;
            }

            public Double getMin() {
                return min;
            }

            public LabelConfiguration setMin(Double min) {
                this.min = min;
                return this;
            }

            public Double getMax() {
                return max;
            }

            public LabelConfiguration setMax(Double max) {
                this.max = max;
                return this;
            }

            public Double getMaxVisible() {
                return maxVisible;
            }

            public LabelConfiguration setMaxVisible(Double maxVisible) {
                this.maxVisible = maxVisible;
                return this;
            }

            public Double getDrawThreshold() {
                return drawThreshold;
            }

            public LabelConfiguration setDrawThreshold(Double drawThreshold) {
                this.drawThreshold = drawThreshold;
                return this;
            }

        }
        public static class SelfReferenceConfiguration {

            private Double size;
            private Double angle;
            private Boolean renderBehindTheNode;

            public Double getSize() {
                return size;
            }

            public SelfReferenceConfiguration setSize(Double size) {
                this.size = size;
                return this;
            }

            public Double getAngle() {
                return angle;
            }

            public SelfReferenceConfiguration setAngle(Double angle) {
                this.angle = angle;
                return this;
            }

            public Boolean getRenderBehindTheNode() {
                return renderBehindTheNode;
            }

            public SelfReferenceConfiguration setRenderBehindTheNode(Boolean renderBehindTheNode) {
                this.renderBehindTheNode = renderBehindTheNode;
                return this;
            }

        }
        public static class ShadowConfiguration {

            private Boolean enabled;
            private String color;
            private Double size;
            private Double x;
            private Double y;

            public Boolean getEnabled() {
                return enabled;
            }

            public ShadowConfiguration setEnabled(Boolean enabled) {
                this.enabled = enabled;
                return this;
            }

            public String getColor() {
                return color;
            }

            public ShadowConfiguration setColor(String color) {
                this.color = color;
                return this;
            }

            public Double getSize() {
                return size;
            }

            public ShadowConfiguration setSize(Double size) {
                this.size = size;
                return this;
            }

            public Double getX() {
                return x;
            }

            public ShadowConfiguration setX(Double x) {
                this.x = x;
                return this;
            }

            public Double getY() {
                return y;
            }

            public ShadowConfiguration setY(Double y) {
                this.y = y;
                return this;
            }

        }

    }
    public static class SelfReferenceConfiguration {

        private Double size;
        private Double angle;
        private Boolean renderBehindTheNode;

        public Double getSize() {
            return size;
        }

        public SelfReferenceConfiguration setSize(Double size) {
            this.size = size;
            return this;
        }

        public Double getAngle() {
            return angle;
        }

        public SelfReferenceConfiguration setAngle(Double angle) {
            this.angle = angle;
            return this;
        }

        public Boolean getRenderBehindTheNode() {
            return renderBehindTheNode;
        }

        public SelfReferenceConfiguration setRenderBehindTheNode(Boolean renderBehindTheNode) {
            this.renderBehindTheNode = renderBehindTheNode;
            return this;
        }

    }
    public static class ShadowConfiguration {

        private Boolean enabled;
        private String color;
        private Double size;
        private Double x;
        private Double y;

        public Boolean getEnabled() {
            return enabled;
        }

        public ShadowConfiguration setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }

        public String getColor() {
            return color;
        }

        public ShadowConfiguration setColor(String color) {
            this.color = color;
            return this;
        }

        public Double getSize() {
            return size;
        }

        public ShadowConfiguration setSize(Double size) {
            this.size = size;
            return this;
        }

        public Double getX() {
            return x;
        }

        public ShadowConfiguration setX(Double x) {
            this.x = x;
            return this;
        }

        public Double getY() {
            return y;
        }

        public ShadowConfiguration setY(Double y) {
            this.y = y;
            return this;
        }

    }
    public static class SmoothConfiguration {

        private Boolean enabled;
        private SmoothType smoothType;
        private ForceDirection forceDirection;
        private Double roundness;

        public enum SmoothType {
            DYNAMIC,
            CONTINUOUS,
            DISCRETE,
            DIAGONALCROSS,
            STRAIGHTCROSS,
            HORIZONTAL,
            VERTICAL,
            CURVEDCW,
            CURVEDCCW,
            CUBICBEZIER;

            @Override
            public String toString() {
                return name().toLowerCase();
            }
        }
        public enum ForceDirection {
            HORIZONTAL,
            VERTICAL,
            NONE;

            @Override
            public String toString() {
                return name().toLowerCase();
            }
        }
    }
    public static class WidthConstraintConfiguration {

        private Double maximum;

        public Double getMaximum() {
            return maximum;
        }

        public WidthConstraintConfiguration setMaximum(Double maximum) {
            this.maximum = maximum;
            return this;
        }

    }

    public ArrowsConfiguration getArrows() {
        return arrows;
    }

    public EdgesOption setArrows(ArrowsConfiguration arrows) {
        this.arrows = arrows;
        return this;
    }

    public EndPointOffsetConfiguration getEndPointOffset() {
        return endPointOffset;
    }

    public EdgesOption setEndPointOffset(EndPointOffsetConfiguration endPointOffset) {
        this.endPointOffset = endPointOffset;
        return this;
    }

    public Boolean getArrowStrikethrough() {
        return arrowStrikethrough;
    }

    public EdgesOption setArrowStrikethrough(Boolean arrowStrikethrough) {
        this.arrowStrikethrough = arrowStrikethrough;
        return this;
    }

    public Boolean getChosen() {
        return chosen;
    }

    public EdgesOption setChosen(Boolean chosen) {
        this.chosen = chosen;
        return this;
    }

    public ColorConfiguration getColor() {
        return color;
    }

    public EdgesOption setColor(ColorConfiguration color) {
        this.color = color;
        return this;
    }

    public Boolean getDashes() {
        return dashes;
    }

    public EdgesOption setDashes(Boolean dashes) {
        this.dashes = dashes;
        return this;
    }

    public FontConfiguration getFont() {
        return font;
    }

    public EdgesOption setFont(FontConfiguration font) {
        this.font = font;
        return this;
    }

    public Boolean getHidden() {
        return hidden;
    }

    public EdgesOption setHidden(Boolean hidden) {
        this.hidden = hidden;
        return this;
    }

    public Double getHoverWidth() {
        return hoverWidth;
    }

    public EdgesOption setHoverWidth(Double hoverWidth) {
        this.hoverWidth = hoverWidth;
        return this;
    }

    public String getLabel() {
        return label;
    }

    public EdgesOption setLabel(String label) {
        this.label = label;
        return this;
    }

    public Boolean getLabelHighlightBold() {
        return labelHighlightBold;
    }

    public EdgesOption setLabelHighlightBold(Boolean labelHighlightBold) {
        this.labelHighlightBold = labelHighlightBold;
        return this;
    }

    public Double getLength() {
        return length;
    }

    public EdgesOption setLength(Double length) {
        this.length = length;
        return this;
    }

    public Boolean getPhysics() {
        return physics;
    }

    public EdgesOption setPhysics(Boolean physics) {
        this.physics = physics;
        return this;
    }

    public ScalingConfiguration getScaling() {
        return scaling;
    }

    public EdgesOption setScaling(ScalingConfiguration scaling) {
        this.scaling = scaling;
        return this;
    }

    public Double getSelectionWidth() {
        return selectionWidth;
    }

    public EdgesOption setSelectionWidth(Double selectionWidth) {
        this.selectionWidth = selectionWidth;
        return this;
    }

    public Double getSelfReferenceSize() {
        return selfReferenceSize;
    }

    public EdgesOption setSelfReferenceSize(Double selfReferenceSize) {
        this.selfReferenceSize = selfReferenceSize;
        return this;
    }

    public SelfReferenceConfiguration getSelfReference() {
        return selfReference;
    }

    public EdgesOption setSelfReference(SelfReferenceConfiguration selfReference) {
        this.selfReference = selfReference;
        return this;
    }

    public ShadowConfiguration getShadow() {
        return shadow;
    }

    public EdgesOption setShadow(ShadowConfiguration shadow) {
        this.shadow = shadow;
        return this;
    }

    public SmoothConfiguration getSmooth() {
        return smooth;
    }

    public EdgesOption setSmooth(SmoothConfiguration smooth) {
        this.smooth = smooth;
        return this;
    }

    public String getTitle() {
        return title;
    }

    public EdgesOption setTitle(String title) {
        this.title = title;
        return this;
    }

    public String getTo() {
        return to;
    }

    public EdgesOption setTo(String to) {
        this.to = to;
        return this;
    }

    public Double getValue() {
        return value;
    }

    public EdgesOption setValue(Double value) {
        this.value = value;
        return this;
    }

    public Double getWidth() {
        return width;
    }

    public EdgesOption setWidth(Double width) {
        this.width = width;
        return this;
    }

    public WidthConstraintConfiguration getWidthConstraint() {
        return widthConstraint;
    }

    public EdgesOption setWidthConstraint(WidthConstraintConfiguration widthConstraint) {
        this.widthConstraint = widthConstraint;
        return this;
    }

}
