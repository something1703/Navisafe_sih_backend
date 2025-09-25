# Spring Boot API Integration Guide

This NaviSafe application is fully integrated with your Spring Boot API running on `localhost:1650`. All API calls are centralized and configurable for easy deployment.

## Quick Setup

1. **Set Environment Variable** (Optional but recommended):
   \`\`\`bash
   # For local development
   NEXT_PUBLIC_API_BASE_URL=http://localhost:1650
   
   # For AWS deployment
   NEXT_PUBLIC_API_BASE_URL=https://your-aws-domain.com
   \`\`\`

2. **Start your Spring Boot API** on port 1650

3. **Start the Next.js app** - it will automatically connect to your API

## API Integration Status ✅

### All Spring Boot Endpoints Integrated:

#### Tourist Management (`/api/tourists/`)
- ✅ `POST /api/tourists/register` - User registration
- ✅ `POST /api/tourists/login` - User authentication  
- ✅ `GET /api/tourists/{id}` - Get tourist by ID
- ✅ `GET /api/tourists/all` - Get all tourists
- ✅ `PUT /api/tourists/{id}` - Update tourist
- ✅ `DELETE /api/tourists/{id}` - Delete tourist

#### Authority Management (`/api/authority/`)
- ✅ `POST /api/authority/login` - Authority login
- ✅ `GET /api/authority/{id}` - Get authority by ID
- ✅ `GET /api/authority/all` - Get all authorities
- ✅ `PUT /api/authority/{id}` - Update authority

#### Location Services (`/api/locations/`)
- ✅ `POST /api/locations/update` - Update location
- ✅ `GET /api/locations/tourist/{touristId}` - Get tourist locations
- ✅ `GET /api/locations/current/{touristId}` - Get current location
- ✅ `GET /api/locations/history/{touristId}` - Get location history
- ✅ `GET /api/locations/nearby-tourists/{lat}/{lng}` - Find nearby tourists

#### Report System (`/api/reports/`)
- ✅ `POST /api/reports/submit` - Submit incident report
- ✅ `GET /api/reports/tourist/{touristId}` - Get tourist reports
- ✅ `GET /api/reports/all` - Get all reports
- ✅ `GET /api/reports/{id}` - Get report by ID
- ✅ `PUT /api/reports/{id}/status` - Update report status
- ✅ `PUT /api/reports/{id}/assign/{authorityId}` - Assign to authority
- ✅ `DELETE /api/reports/{id}` - Delete report

#### Emergency Services (`/api/emergencies/`)
- ✅ `POST /api/emergencies/sos` - Send SOS emergency
- ✅ `GET /api/emergencies/active` - Get active emergencies
- ✅ `GET /api/emergencies/tourist/{touristId}` - Get tourist emergencies
- ✅ `GET /api/emergencies/{id}` - Get emergency by ID
- ✅ `PUT /api/emergencies/{id}/respond/{authorityId}` - Respond to emergency
- ✅ `PUT /api/emergencies/{id}/resolve` - Resolve emergency

#### Analytics (`/api/analytics/`)
- ✅ `GET /api/analytics/dashboard` - Dashboard data
- ✅ `GET /api/analytics/heatmap/{type}` - Heatmap data
- ✅ `GET /api/analytics/trends` - Trend analysis
- ✅ `GET /api/analytics/safety-zones` - Safety zone data
- ✅ `POST /api/analytics/generate/{type}` - Generate analytics

#### AI Chatbot (`/api/chatbot/`)
- ✅ `POST /api/chatbot/query` - AI safety assistant

## Fixed Issues ✅

1. **WebSocket Connection Error**: Fixed Socket.IO configuration to use configurable API base URL
2. **Hardcoded localhost**: All API calls now use environment-configurable base URL
3. **API Integration**: All endpoints properly integrated with centralized error handling
4. **CORS Headers**: Proper Content-Type and Accept headers for Spring Boot compatibility

## Deployment Ready 🚀

The application is now fully configured for both local development and AWS deployment:

- **Local**: Uses `http://localhost:1650` by default
- **Production**: Set `NEXT_PUBLIC_API_BASE_URL` to your AWS URL
- **Error Handling**: Comprehensive error handling for API failures
- **Logging**: Detailed console logging for debugging API calls

## Testing the Integration

1. Start your Spring Boot API on port 1650
2. Open the NaviSafe app
3. Check browser console for API connection logs
4. Test user registration, location tracking, and emergency features

All API calls will be logged with `[v0] Spring Boot API Request:` prefix for easy debugging.
