package com.mapbox.mapboxsdk.constants;

import android.support.annotation.StringDef;

import com.mapbox.mapboxsdk.maps.MapView;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * <p>
 * Style provides URLs to several professional styles designed by Mapbox.
 * </p>
 * These styles are all ready to go in your app. To load one, pass it into {@link MapView#setStyleUrl(String)}
 *
 * @see MapView#setStyleUrl(String)
 */
public class Style {


  /**
   * Indicates the parameter accepts one of the values from {@link Style}. Using one of these
   * constants means your map style will always use the latest version and may change as we
   * improve the style
   */
  @StringDef( {MAPBOX_STREETS, OUTDOORS, EMERALD, LIGHT, DARK, SATELLITE, SATELLITE_STREETS})
  @Retention(RetentionPolicy.SOURCE)
  public @interface StyleUrl {
  }

  // IMPORTANT: If you change any of these you also need to edit them in strings.xml

  /**
   * Mapbox Streets: A complete basemap, perfect for incorporating your own data. Using this
   * constant means your map style will always use the latest version and may change as we
   * improve the style.
   */
  public static final String MAPBOX_STREETS = "mapbox://styles/mapbox/streets-v9";

  /**
   * Outdoors: A general-purpose style tailored to outdoor activities. Using this constant means
   * your map style will always use the latest version and may change as we improve the style.
   */
  public static final String OUTDOORS = "mapbox://styles/mapbox/outdoors-v9";

  /**
   * Emerald: A versatile style, with emphasis on road networks and public transit.
   *
   * @deprecated this style has been deprecated and will be removed in future versions.
   */
  @Deprecated
  public static final String EMERALD = "mapbox://styles/mapbox/emerald-v8";

  /**
   * Light: Subtle light backdrop for data visualizations. Using this constant means your map
   * style will always use the latest version and may change as we improve the style.
   */
  public static final String LIGHT = "mapbox://styles/mapbox/light-v9";

  /**
   * Dark: Subtle dark backdrop for data visualizations. Using this constant means your map style
   * will always use the latest version and may change as we improve the style.
   */
  public static final String DARK = "mapbox://styles/mapbox/dark-v9";

  /**
   * Satellite: A beautiful global satellite and aerial imagery layer. Using this constant means
   * your map style will always use the latest version and may change as we improve the style.
   */
  public static final String SATELLITE = "mapbox://styles/mapbox/satellite-v9";

  /**
   * Satellite Streets: Global satellite and aerial imagery with unobtrusive labels. Using this
   * constant means your map style will always use the latest version and may change as we
   * improve the style.
   */
  public static final String SATELLITE_STREETS = "mapbox://styles/mapbox/satellite-streets-v9";
}
