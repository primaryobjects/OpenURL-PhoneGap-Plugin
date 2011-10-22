//
//  OpenURL.h
//
//  Created by Kory Becker on 10/22/11.
//

#import <Foundation/Foundation.h>
#import "/Users/Shared/PhoneGap/Frameworks/PhoneGap.framework/Headers/PGPlugin.h"


@interface OpenURL : PGPlugin {
    
}

- (void) open:(NSMutableArray*)arguments withDict:(NSMutableDictionary*)options;

@end
