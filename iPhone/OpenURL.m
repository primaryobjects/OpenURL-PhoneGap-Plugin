//
//  OpenURL.m
//
//  Created by Kory Becker on 10/22/11.
//

#import "OpenURL.h"


@implementation OpenURL

- (void) open:(NSMutableArray*)arguments withDict:(NSMutableDictionary*)options
{
	[[UIApplication sharedApplication] openURL:[NSURL URLWithString:(NSString*)[arguments objectAtIndex:0]]];    
}

@end
