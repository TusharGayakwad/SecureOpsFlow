# Use a vulnerable version of Alpine Linux intentionally
FROM nginx:1.19.0  # Older version with potential vulnerabilities

# Add a vulnerable tool to trigger vulnerability detection
RUN apk add --no-cache curl=7.69.1-r0   # Vulnerable version of curl

# Copy index.html file
COPY index.html /usr/share/nginx/html/index.html

# Expose port 80
EXPOSE 80

# Start nginx
CMD ["nginx", "-g", "daemon off;"]
